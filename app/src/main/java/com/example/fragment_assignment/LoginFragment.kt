package com.example.fragment_assignment
import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Color
import android.icu.number.SimpleNotation
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragment_assignment.databinding.LoginAyoutBinding
import com.google.android.material.snackbar.Snackbar

class LoginFragment:Fragment() {
    private lateinit var binding : LoginAyoutBinding
    lateinit var notificationManager: NotificationManagerCompat
    val notificationChannelEntertainmentId = "Instagram_channel"
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
                .add(R.id.mainContainer, productsFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnGoogle.setOnClickListener {
                        Toast.makeText(context, "Loging In With Google", Toast.LENGTH_LONG).show()

            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnFacebook.setOnClickListener {
            Snackbar.make(

                binding.root,
                "Loging In With Facebook",
                Snackbar.LENGTH_LONG
            ).setBackgroundTint(Color.GRAY)
                .setTextColor(Color.BLUE)
                .setAction(

                        "View",{
                            Log.e("tag","View action is taken")
                    }
                )
                .show()

            //Toast.makeText(context, "Loging In With Facebook", Toast.LENGTH_LONG).show()
            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnGit.setOnClickListener {

            Toast.makeText(context, "Loging In With GitHub", Toast.LENGTH_LONG).show()
            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        binding.btnTwitter.setOnClickListener {
            Toast.makeText(context, "Loging In With Twitter", Toast.LENGTH_LONG).show()
            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, loginToFragment, null)
                .addToBackStack(null)
                .commit()

        }

        return binding.root
    }

}