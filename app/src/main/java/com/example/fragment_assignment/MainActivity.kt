package com.example.fragment_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    private lateinit var loginFragment1 : LoginFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        //setContentView(R.layout.login_ayout)
        loginFragment1 = supportFragmentManager.findFragmentById(R.id.loginFragment1) as LoginFragment
    }
}