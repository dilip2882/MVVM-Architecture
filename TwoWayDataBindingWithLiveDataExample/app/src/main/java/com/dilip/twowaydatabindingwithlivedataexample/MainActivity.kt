package com.dilip.twowaydatabindingwithlivedataexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dilip.twowaydatabindingwithlivedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)::class.java]

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