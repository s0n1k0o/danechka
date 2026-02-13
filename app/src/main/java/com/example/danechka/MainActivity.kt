package com.example.danechka

import com.example.danechka.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewResult: TextView = findViewById(R.id.textViewResult)
        val editTextInput: EditText = findViewById(R.id.editTextInput)
        val buttonShow: Button = findViewById(R.id.buttonShow)

        buttonShow.setOnClickListener {
            textViewResult.text = editTextInput.text.toString()
        }
    }
}