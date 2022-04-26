package com.example.fragment_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.fragment_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* var edtUserName = findViewById(R.id.edtUserName) as EditText
        var edtPassword = findViewById(R.id.edtPassword) as EditText
        var btnReset = findViewById(R.id.btnReset) as Button
        var btnSubmit = findViewById(R.id.btnSubmit) as Button

*/
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnReset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            binding.edtUserName.setText("")
            binding.edtPassword.setText("")
        }

        // set on-click listener
        binding.btnSubmit.setOnClickListener {
           // val user_name = edtUserName.text;
            //val password = edtPassword.text;
            if(binding.edtUserName.getText().toString().equals("swati")&& binding.edtPassword.getText().toString().equals("1234"))
            Toast.makeText(this@MainActivity, "Login Succesfull", Toast.LENGTH_LONG).show()
            else {
                Toast.makeText(this@MainActivity, "Login Failed Try again", Toast.LENGTH_LONG)
                    .show()
                binding.edtUserName.setText("")
                binding.edtPassword.setText("")
            }


        }
    }
}


