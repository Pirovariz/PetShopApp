package com.bitas.petshop.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bitas.petshop.databinding.ActivitySplashScreenBinding
import com.bitas.petshop.ui.login.LoginActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private var _binding: ActivitySplashScreenBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("Teste", "Teste")
        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java, )
            startActivity(intent)
        }, 2000)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}