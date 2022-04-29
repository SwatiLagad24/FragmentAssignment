package com.example.fragment_assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_assignment.databinding.HomeFragmentBinding

class HomeFragment:Fragment() {
    private lateinit var binding:HomeFragmentBinding
    private var userName : String? = null
    private var userCode : Int? = null


    interface OnDataListener{//creating interface to send dta back to another fragment
    fun onData(data:String)//creating var data of type string
        }
    var onDataListener:OnDataListener?=null//creating object of interfce can be null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var loginToFragment=LoginToFragment()
        binding= HomeFragmentBinding.inflate(layoutInflater)

        userName = arguments?.getString("username")
        userCode = arguments?.getInt("usercode")
        binding.txtUserInfo.text="$userName"


        binding.btnFinish.setOnClickListener{

            //using custom event deligation model we have send data from home fragment
            onDataListener?.onData(binding.edtData.text.toString())


            parentFragmentManager.beginTransaction()
                .remove(this)
                .commit()
           /*parentFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()*/



        }


        return binding.root
    }
}