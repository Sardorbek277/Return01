package com.example.imtihon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.core.widget.addTextChangedListener
import com.example.imtihon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText.addTextChangedListener {
            val t = binding.editText.text.toString()
            binding.tvView.text = t

        }
        binding.switch1.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked){

               val r= binding.tvView.text.reversed()
                binding.tvView.text = r
                //Switchis in the "ON" position
                //Do something when it's ON
            }else{
                val s =binding.tvView.text.reversed()

                binding.tvView.text = s

                //Switchis in the "OFF" position
                //Do something when it's OFF
            }

        }

        val switch1 = findViewById<Switch>(R.id.switch1)
    }
}