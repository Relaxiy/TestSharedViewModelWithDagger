package com.example.testsharedviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsharedviewmodel.databinding.ActivityMainBinding
import com.example.testsharedviewmodel.di.ActivityComponent
import com.example.testsharedviewmodel.di.DaggerActivityComponent
import com.example.testsharedviewmodel.presentation.FirstTestedFragment

class MainActivity : AppCompatActivity() {

    lateinit var activityComponent: ActivityComponent

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        activityComponent = DaggerActivityComponent.builder().viewStore(this).build()
        openFragment(FirstTestedFragment.TAG, FirstTestedFragment.newInstance(), R.id.container)
    }


}