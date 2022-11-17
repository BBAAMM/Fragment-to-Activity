package com.example.fragment_to_activity_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), CallBack {
    lateinit var exampleText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.button_start)
        exampleText = findViewById(R.id.textView_example)
        startButton.setOnClickListener {
            ExampleFragment(this).show(supportFragmentManager, "ExampleFragment")
        }
    }

    override fun callBackExample() {
        exampleText.setText("Fragment Clicked")
    }
}