package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentCardsBinding

class CardsFragment : ComponentFragment() {

    private lateinit var binding: FragmentCardsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupCustomButton(binding.topImageCustomCardView.customLayout)
        setupCustomButton(binding.withoutImageCustomCardView.customLayout)
    }

    private fun setupCustomButton(customLayout: ViewGroup) {
        customLayout.findViewById<Button>(R.id.button)
            .setOnClickListener {
                Toast.makeText(
                    it.context,
                    "Why so curious?",
                    Toast.LENGTH_LONG
                )
                    .show()
            }
    }

}