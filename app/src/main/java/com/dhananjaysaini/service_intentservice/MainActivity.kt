package com.dhananjaysaini.service_intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var start: Button? = null
    private var stop: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start = findViewById<Button>(R.id.startButton)
        stop = findViewById<Button>(R.id.stopButton)

        start!!.setOnClickListener(this)
        stop!!.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        if (view === start) {

            startService(Intent(this, NewService::class.java))
        }

        else if (view === stop) {

            stopService(Intent(this, NewService::class.java))
        }
    }
}

