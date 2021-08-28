package com.lexical.foodmarketapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.lexical.foodmarketapp.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val pageRequest = intent.getIntExtra("page_request", 0)

        if (pageRequest == 2) {
            val navOptions = NavOptions.Builder().setPopUpTo(R.id.fragmentSignIn, true).build()

            Navigation.findNavController(findViewById(R.id.authHostFragment)).navigate(R.id.action_signup, null, navOptions)
        }
    }
}