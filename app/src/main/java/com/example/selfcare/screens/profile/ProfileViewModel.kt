package com.example.selfcare.screens.profile

import androidx.lifecycle.ViewModel
import com.example.selfcare.R

class ProfileViewModel: ViewModel() {
    val user: User = User("Даша", R.drawable.profile)
}