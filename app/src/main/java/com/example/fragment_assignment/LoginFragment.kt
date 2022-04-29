package com.example.fragment_assignment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragment_assignment.databinding.LoginAyoutBinding

class LoginFragment:Fragment() {
    private lateinit var binding : LoginAyoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var loginToFragment=LoginToFragment()

        var productsFragment=ProductsFragment()

        binding= LoginAyoutBinding.inflate(layoutInflater)

        binding.btnInsta.setOnClickListener {
            Toast.makeText(context, "Loging In With Instagram", Toast.LENGTH_LONG).show()

            parentFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, productsFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnGoogle.setOnClickListener {
            Toast.makeText(context, "Loging In With Google", Toast.LENGTH_LONG).show()

            parentFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnFacebook.setOnClickListener {

            Toast.makeText(context, "Loging In With Facebook", Toast.LENGTH_LONG).show()
            parentFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnGit.setOnClickListener {
            Toast.makeText(context, "Loging In With GitHub", Toast.LENGTH_LONG).show()
            parentFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnTwitter.setOnClickListener {
            Toast.makeText(context, "Loging In With Twitter", Toast.LENGTH_LONG).show()
            parentFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        return binding.root
    }

}