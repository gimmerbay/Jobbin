package com.example.jobbin.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.jobbin.R
import com.example.jobbin.databinding.FragmentHomeBinding
import com.example.jobbin.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var binding : FragmentProfileBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}