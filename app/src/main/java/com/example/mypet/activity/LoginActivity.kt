package com.example.mypet.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypet.R
import com.example.mypet.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    var binding:ActivityLoginBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnLogin?.setOnClickListener {
            var intent= Intent(this,RegisterActivity::class.java)
            startActivity(intent)

        }
    }
}