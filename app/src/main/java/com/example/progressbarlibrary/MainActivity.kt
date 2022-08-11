package com.example.progressbarlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myprogressbar_library.ProgressBarDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loading = ProgressBarDialog(this)
        loading.startLoading()

        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                loading.dismissDialog()
            }

        },90000)
    }
}