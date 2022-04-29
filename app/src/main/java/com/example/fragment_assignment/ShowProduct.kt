package com.example.fragment_assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_assignment.databinding.ShowProductBinding

class ShowProduct :Fragment(){

    private var Details : String? = null
    lateinit var binding: ShowProductBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Details = arguments?.getString("Details")

        binding.txtShow.text="$Details"

        return binding.root
    }
}