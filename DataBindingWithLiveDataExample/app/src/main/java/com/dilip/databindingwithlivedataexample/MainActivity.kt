package com.dilip.databindingwithlivedataexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dilip.databindingwithlivedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        /*mainViewModel.quoteLiveData.observe(this, Observer{
            binding.quoteTextview.text = it
        })*/

        /*binding.btnUpdate.setOnClickListener {
            mainViewModel.updateQuote()
        }*/

        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this

    }
}