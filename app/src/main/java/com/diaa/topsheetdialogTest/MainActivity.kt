package com.diaa.topsheetdialogTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val button = findViewById<Button>(R.id.bt)
        button.setOnClickListener {
            val topDialogTest = TopDialogTest()
            topDialogTest.show(supportFragmentManager, topDialogTest.tag)
        }
    }
}