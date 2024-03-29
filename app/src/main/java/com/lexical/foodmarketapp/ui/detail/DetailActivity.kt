package com.lexical.foodmarketapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.databinding.ActivityDetailBinding
import kotlinx.android.synthetic.main.layout_toolbar.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    fun toolbarPayment() {
        toolbar.visibility = View.VISIBLE
        toolbar.title = "Payment"
        toolbar.subtitle = "You deserve better meal"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000, null)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun toolbarDetail() {
        toolbar.visibility = View.GONE
    }
}