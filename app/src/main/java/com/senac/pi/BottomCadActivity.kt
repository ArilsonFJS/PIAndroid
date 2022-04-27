package com.senac.pi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class BottomCadActivity : AppCompatActivity() {
    
    lateinit var binding: ActivityBottomCadBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityBottomCadBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}