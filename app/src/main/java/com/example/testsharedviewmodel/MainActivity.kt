package com.example.testsharedviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testsharedviewmodel.databinding.ActivityMainBinding
import com.example.testsharedviewmodel.di.AppComponent
import com.example.testsharedviewmodel.di.DaggerAppComponent
import com.example.testsharedviewmodel.presentation.FirstTestedFragment

class MainActivity : AppCompatActivity() {

    companion object{
        var appComponent: AppComponent? = null
    }
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appComponent = DaggerAppComponent.builder().viewStore(this).build()
        openFragment(FirstTestedFragment.TAG, FirstTestedFragment.newInstance(), R.id.container)
    }


}