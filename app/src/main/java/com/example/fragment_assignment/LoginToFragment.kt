package com.example.fragment_assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_assignment.databinding.LoginToFragmentBinding

class LoginToFragment:Fragment() {
    private lateinit var binding: LoginToFragmentBinding

    var data : String? = null
        set(value) {
            field = value
            binding.txtData.text = value
        }


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
            homeFragment.onDataListener=MyOnDataListener()

            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, homeFragment, null)
                .addToBackStack(null)
                .commit()

        }
/*        binding.btnLogin.setOnClickListener{

            var productsFragment = ProductsFragment()

            var inputBundle = Bundle()
            inputBundle.putString("username", binding.edtUsername.text.toString())
            inputBundle.putInt("usercode", 24)


            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, productsFragment, null)
                .addToBackStack(null)
                .commit()

        }*/
        return binding.root

}
    inner class MyOnDataListener : HomeFragment.OnDataListener {
        override fun onData(data: String) {
            this@LoginToFragment.data = data

        }
    }
}