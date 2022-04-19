package com.example.testsharedviewmodel.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testsharedviewmodel.MainActivity
import com.example.testsharedviewmodel.R
import com.example.testsharedviewmodel.databinding.FragmentSecondBinding
import javax.inject.Inject

class SecondTestedFragment : Fragment(R.layout.fragment_second) {
    private val binding by viewBinding<FragmentSecondBinding>()

    companion object{
        const val TAG = "SecondTestedFragment"
        fun newInstance() = SecondTestedFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivity.appComponent?.inject(this)
    }

    @Inject
    lateinit var testedViewModel: TestedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        testedViewModel.message.observe(viewLifecycleOwner){
            binding.textView.text = it
        }
    }
}