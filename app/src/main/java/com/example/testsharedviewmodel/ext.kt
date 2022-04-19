package com.example.testsharedviewmodel

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.testsharedviewmodel.di.ActivityComponent
import com.example.testsharedviewmodel.di.AppComponent

fun FragmentActivity.openFragment(tag: String, fragment: Fragment, id: Int){
    supportFragmentManager
        .beginTransaction()
        .replace(id, fragment, tag)
        .addToBackStack(tag)
        .commit()
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is TestApplication -> appComponent
        else -> this.applicationContext.appComponent
    }

val Context.activityComponent: ActivityComponent
    get() = when (this) {
        is MainActivity -> activityComponent
        else -> this.applicationContext.activityComponent
    }