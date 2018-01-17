package com.side_projects.android.uffcompanionapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setupOnClick() {

        var button = enterButton

        button.setOnClickListener {

            // Navigate to Game List Activity
            var myIntent = Intent(this , MainActivity)
            startActivity(myIntent)

        }

    }
}
