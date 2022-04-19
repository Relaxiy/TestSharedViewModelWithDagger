package com.example.testsharedviewmodel

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.testsharedviewmodel.di.AppComponent
import com.example.testsharedviewmodel.presentation.TestedViewModel

fun FragmentActivity.openFragment(tag: String, fragment: Fragment, id: Int){
    supportFragmentManager
        .beginTransaction()
        .replace(id, fragment, tag)
        .addToBackStack(tag)
        .commit()
}