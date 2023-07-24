package com.tushar.fragmentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.tushar.fragmentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var newinterface: NewInterface



    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPass.setOnClickListener() {
           newinterface.changeFragmentText(binding.ettext.text.toString())

        }
        binding.btnPlus.setOnClickListener(){
            newinterface.add()

        }
        binding.btnMinus.setOnClickListener() {
           newinterface.minus()
                   }
    }
}