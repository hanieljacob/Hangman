package com.example.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import com.example.hangman.databinding.HintPanelBinding

class HintPanel: Fragment() {
    private lateinit var binding: HintPanelBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HintPanelBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragmentResultListener("MGF-HF") { key, bundle ->
            val hint = bundle.getString("hint").toString()
            val hintCount = bundle.getString("hint_count").toString().toInt()
            println(hintCount)
            binding.apply {
                hintButton?.setOnClickListener() {
                    setFragmentResult("HF-MGF", bundleOf("hintCount" to "incrementCount"))
                    if (hintCount == 0) {
                        hintTextView?.text = hint
                    }
                }
            }
        }
    }
}