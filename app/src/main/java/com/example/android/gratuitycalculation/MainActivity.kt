package com.example.android.gratuitycalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gratuity.setOnClickListener {
            answer.text = "Your Gratuity Is:- "+ ((((serviceYear.text.toString().toInt() * pfEarning.text.toString().toInt())/26)*15)).toString()
            Toast.makeText(this,"Your Gratuity Is:-"+answer.text,Toast.LENGTH_LONG).show()
        }
    }
}
