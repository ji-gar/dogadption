package com.example.mypet.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypet.R
import com.example.mypet.databinding.ActivityLoginBinding
import com.example.mypet.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    //nananasss
    var binding: ActivityRegisterBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.tvRegister?.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}