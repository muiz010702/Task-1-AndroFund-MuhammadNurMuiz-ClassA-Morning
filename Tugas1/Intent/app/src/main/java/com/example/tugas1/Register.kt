package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNama:EditText
    private lateinit var etUsername:EditText
    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etNama = findViewById(R.id.InputNama)
        etUsername = findViewById(R.id.InputUser)
        etEmail = findViewById(R.id.InputEmail)
        etPassword = findViewById(R.id.InputPass)

        var Klik:Button = findViewById(R.id.BtnDaftar)
        Klik.setOnClickListener(this)
    }

    override fun onClick(vDaftar: View) {
        when(vDaftar.id){
            R.id.BtnDaftar -> {

                var Input = Bundle()
                Input.putString("Nama",etNama.text.toString())
                Input.putString("Username",etUsername.text.toString())
                Input.putString("Email",etEmail.text.toString())
                Input.putString("Password",etPassword.text.toString())

                var Simpan = Intent(this@Register,Login::class.java)
                Simpan.putExtras(Bundle(Input))
                startActivity(Simpan)
            }
        }
    }
}