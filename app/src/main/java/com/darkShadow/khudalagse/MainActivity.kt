package com.darkShadow.khudalagse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton =findViewById<Button>(R.id.login_button)
        val userPhone = findViewById<EditText>(R.id.user_phone)

        loginButton.setOnClickListener{
                val typedText= userPhone.text

            Toast.makeText(this,typedText,Toast.LENGTH_SHORT).show()
        }

    }



}