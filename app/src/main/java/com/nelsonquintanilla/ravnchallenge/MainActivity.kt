package com.nelsonquintanilla.ravnchallenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity that inflates a layout that contains a NavHostFragment.
 */
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}