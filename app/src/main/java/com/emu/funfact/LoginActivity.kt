package com.emu.funfact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import com.emu.funfact.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var binding: ActivityLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            doLogin()
        }

    }
        private fun doLogin() {

            if (binding?.email?.isEmpty() == true ) {
                binding?.email?.error = "Please enter Valid Email"
                binding?.email?.requestFocus()
                return
            }
            if (binding?.password?.isEmpty() == true) {
                binding?.password?.error = "Please enter password"
                binding?.password?.requestFocus()
                return
            }


            }


        }






