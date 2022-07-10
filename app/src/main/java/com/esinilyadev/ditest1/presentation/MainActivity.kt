package com.esinilyadev.ditest1.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.esinilyadev.ditest1.R
import com.esinilyadev.ditest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        viewModel = (application as MainApp).viewModel(MainViewModel::class.java, this)

        buttonListeners()
        observe()
    }

    private fun buttonListeners(){
        binding.dogButton.setOnClickListener {
            viewModel.getDog(DOG_KEY)
        }

        binding.catButton.setOnClickListener {
            viewModel.getCat(CAT_KEY)
        }
    }

    private fun observe(){
        viewModel.observe(this){
            binding.image.setImageDrawable(it)
        }
    }

    companion object{
        const val DOG_KEY = 1
        const val CAT_KEY = 0
    }
}