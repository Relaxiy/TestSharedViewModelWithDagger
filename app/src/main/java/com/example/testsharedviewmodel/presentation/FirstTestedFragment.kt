package com.example.testsharedviewmodel.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testsharedviewmodel.MainActivity
import com.example.testsharedviewmodel.R
import com.example.testsharedviewmodel.activityComponent
import com.example.testsharedviewmodel.databinding.FragmentFirstBinding
import com.example.testsharedviewmodel.openFragment
import javax.inject.Inject

class FirstTestedFragment : Fragment(R.layout.fragment_first) {

    private val binding by viewBinding<FragmentFirstBinding>()

    @Inject
    lateinit var testedViewModel: TestedViewModel

    companion object {
        const val TAG = "FirstTestedFragment"
        fun newInstance() = FirstTestedFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().activityComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
            testedViewModel.sendMessage(binding.editText.text.toString())
            requireActivity().openFragment(
                SecondTestedFragment.TAG,
                SecondTestedFragment.newInstance(),
                R.id.container
            )
        }
    }
}
