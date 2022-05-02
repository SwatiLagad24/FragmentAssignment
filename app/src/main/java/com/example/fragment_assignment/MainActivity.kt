package com.example.fragment_assignment

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.example.fragment_assignment.databinding.ActivityMainBinding
import com.example.fragment_assignment.databinding.LoginAyoutBinding


class MainActivity : AppCompatActivity() {
    lateinit var notificationManager: NotificationManagerCompat
    val notificationChannelEntertainmentId = "Instagram_channel"

        private lateinit var loginFragment1 : LoginFragment

        private lateinit var binding : ActivityMainBinding


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationManager= NotificationManagerCompat.from(this)

        createNotificationChannels()
        bigPictureNotification()
        actionStyleNotification()
        init()
    }
    fun bigPictureNotification(){
        var builder= NotificationCompat.Builder(this,notificationChannelEntertainmentId)
        builder.setContentTitle("Instagram")
        builder.setContentTitle("priya shared a reel to you")

        var bigPictureStyle= NotificationCompat.BigPictureStyle()
        bigPictureStyle.setBigContentTitle(" vacation start ")
        bigPictureStyle.setSummaryText("registration are open for camp ")
        var bitmap=BitmapFactory.decodeResource(resources,R.drawable.img)
        bigPictureStyle.bigPicture(bitmap)
        builder.setSmallIcon(R.drawable.img_1)//mandetory


        var actionIntent= Intent(this,MainActivity::class.java)
        var actionPendingIntent= PendingIntent.getActivity(this,1,actionIntent,0)
        builder.setContentIntent(actionPendingIntent)
        builder.setStyle(bigPictureStyle)

        notificationManager.notify(103,builder.build())


    }
    fun createNotificationChannels()
    {


        var channelInstagramBuilder= NotificationChannelCompat.Builder(
            "Instagram_channel",NotificationManager.IMPORTANCE_HIGH
        )
        channelInstagramBuilder.setName("Instagram_channel")
        channelInstagramBuilder.setDescription("Audio/video related to instagram")
        channelInstagramBuilder.setShowBadge(true)
        notificationManager.createNotificationChannel(channelInstagramBuilder.build())
        //    var channelInstagram=NotificationChannel("Instagram_Channel","Instagram",NotificationManager.IMPORTANCE_HIGH)


    }

    private fun init(){

        //setContentView(R.layout.login_ayout)
        loginFragment1 = supportFragmentManager.findFragmentById(R.id.loginFragment1) as LoginFragment
    }
    fun simpleNotification()
    {

            var notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            var notificationBuilder = Notification.Builder(this)
            notificationBuilder.setContentText("Your account has been reseted")
            notificationBuilder.setContentTitle("Instagram")
            var largeIcon = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)

    }

}