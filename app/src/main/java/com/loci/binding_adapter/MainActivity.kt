package com.loci.binding_adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.loci.binding_adapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.vm = viewModel
        binding.lifecycleOwner = this


//        var age = 0
//
//        val ageArea = findViewById<TextView>(R.id.ageArea)
//        val imageArea = findViewById<ImageView>(R.id.imgArea)
//        val plus = findViewById<Button>(R.id.plus)
//
//        plus.setOnClickListener {
//            age++
//
//            ageArea.text = age.toString()
//
//            if (age > 20) {
//                imageArea.setImageResource(R.drawable.ic_launcher_foreground)
//            }
//        }



    }
}