package com.example.fragment_assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_assignment.databinding.LoginToFragmentBinding

class LoginToFragment:Fragment() {
    private lateinit var binding: LoginToFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= LoginToFragmentBinding.inflate(layoutInflater)
        binding.btnLogin.setOnClickListener{

            var homeFragment = HomeFragment()

            var inputBundle = Bundle()
            inputBundle.putString("username", binding.edtUsername.text.toString())
            inputBundle.putInt("usercode", 24)

            homeFragment.arguments = inputBundle

            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, homeFragment, null)
                .addToBackStack(null)
                .commit()

        }
        return binding.root
    }
}