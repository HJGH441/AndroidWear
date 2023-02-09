package com.example.androidwear

import android.app.Activity
import android.os.Bundle
import com.example.androidwear.databinding.ActivityClockBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityClockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityClockBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvSaludo.text= "Q Onda Krnal"
        binding.bnCambio.text  ="Enviar"
    }
}