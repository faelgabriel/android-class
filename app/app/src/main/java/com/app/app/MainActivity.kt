package com.app.app

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        usdButton.setOnClickListener(View.OnClickListener {
            outputField.setText((inputField.text.toString().toDouble() * 3).toString() + " USD")
        })

        cadButton.setOnClickListener(View.OnClickListener {
            outputField.setText((inputField.text.toString().toDouble() * 2.8).toString() + " CAD")
        })

        inrButton.setOnClickListener(View.OnClickListener {
            outputField.setText((inputField.text.toString().toDouble() * 22).toString() + " INR")
        })

        eurButton.setOnClickListener(View.OnClickListener {
            outputField.setText((inputField.text.toString().toDouble() * 5).toString() + " EUR")
        })
    }


}
