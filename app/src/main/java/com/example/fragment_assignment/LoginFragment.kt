package com.example.fragment_assignment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment_assignment.databinding.LoginAyoutBinding

class LoginFragment:Fragment() {
    private lateinit var binding : LoginAyoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return super.onCreateView(inflater, container, savedInstanceState)
        binding= LoginAyoutBinding.inflate(layoutInflater)


        binding.btnGoogle.setOnClickListener {
            Toast.makeText(context, "Loging In With Google", Toast.LENGTH_LONG).show()
        }

        binding.btnFacebook.setOnClickListener {
            Toast.makeText(context, "Loging In With Facebook", Toast.LENGTH_LONG).show()
        }

        binding.btnGit.setOnClickListener {
            Toast.makeText(context, "Loging In With GitHub", Toast.LENGTH_LONG).show()
        }

        binding.btnTwitter.setOnClickListener {
            Toast.makeText(context, "Loging In With Twitter", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }

}