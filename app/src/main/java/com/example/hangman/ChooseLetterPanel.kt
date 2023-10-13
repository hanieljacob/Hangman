package com.example.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hangman.databinding.ChooseLetterPanelBinding

class ChooseLetterPanel : Fragment() {

    private lateinit var binding: ChooseLetterPanelBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = ChooseLetterPanelBinding.inflate(layoutInflater, container, false)
         return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            aButton.setOnClickListener {
                aButton.isEnabled = false
            }
            bButton.setOnClickListener {
                bButton.isEnabled = false
            }
            cButton.setOnClickListener {
                cButton.isEnabled = false
            }
            dButton.setOnClickListener {
                dButton.isEnabled = false
            }
            eButton.setOnClickListener {
                eButton.isEnabled = false
            }
            fButton.setOnClickListener {
                fButton.isEnabled = false
            }
            gButton.setOnClickListener {
                gButton.isEnabled = false
            }
            hButton.setOnClickListener {
                hButton.isEnabled = false
            }
            iButton.setOnClickListener {
                iButton.isEnabled = false
            }
            jButton.setOnClickListener {
                jButton.isEnabled = false
            }
            kButton.setOnClickListener {
                kButton.isEnabled = false
            }
            lButton.setOnClickListener {
                lButton.isEnabled = false
            }
            mButton.setOnClickListener {
                mButton.isEnabled = false
            }
            nButton.setOnClickListener {
                nButton.isEnabled = false
            }
            oButton.setOnClickListener {
                oButton.isEnabled = false
            }
            pButton.setOnClickListener {
                pButton.isEnabled = false
            }
            qButton.setOnClickListener {
                qButton.isEnabled = false
            }
            rButton.setOnClickListener {
                rButton.isEnabled = false
            }
            sButton.setOnClickListener {
                sButton.isEnabled = false
            }
            tButton.setOnClickListener {
                tButton.isEnabled = false
            }
            uButton.setOnClickListener {
                uButton.isEnabled = false
            }
            vButton.setOnClickListener {
                vButton.isEnabled = false
            }
            wButton.setOnClickListener {
                wButton.isEnabled = false
            }
            xButton.setOnClickListener {
                xButton.isEnabled = false
            }
            yButton.setOnClickListener {
                yButton.isEnabled = false
            }
            zButton.setOnClickListener {
                zButton.isEnabled = false
            }

        }
    }

}