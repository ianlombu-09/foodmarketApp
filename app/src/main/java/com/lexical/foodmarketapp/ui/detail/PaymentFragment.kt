package com.lexical.foodmarketapp.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lexical.foodmarketapp.R
import com.lexical.foodmarketapp.databinding.FragmentDetailBinding
import com.lexical.foodmarketapp.databinding.FragmentPaymentBinding
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : Fragment() {

    private var _binding: FragmentPaymentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPaymentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (activity as DetailActivity).toolbarPayment()

        btnCheckout.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_payment_success)
        }
    }
}