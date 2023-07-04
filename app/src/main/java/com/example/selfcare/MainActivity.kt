package com.example.selfcare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.selfcare.databinding.ActivityMainBinding
import com.example.selfcare.screens.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.mainContainer, ProfileFragment())
                .commit()
        }
    }
}