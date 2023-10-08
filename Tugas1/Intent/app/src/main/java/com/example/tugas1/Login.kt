package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUser:EditText
    private lateinit var etPass:EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUser = findViewById(R.id.InputUsername)
        etPass = findViewById(R.id.InputPassword)

        var Tampil = intent.extras
        if(Tampil != null){
            etUser.setText(Tampil.getString("Username"))
            etPass.setText(Tampil.getString("Password"))
        }

        var Klik : Button = findViewById(R.id.BtnLogin)
        Klik.setOnClickListener(this)
    }

    override fun onClick(vLogin: View) {
        when(vLogin.id){
            R.id.BtnLogin -> {
                var Masuk = Intent(this@Login,MainActivity::class.java)
                startActivity(Masuk)
            }
        }
    }
}