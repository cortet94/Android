package com.side_projects.android.uffcompanionapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Corey on 1/13/18.
 */
class GameListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setupOnClick() {

        var button = enterButton

        button.setOnClickListener {

            // Navigate to Game List Activity
            var myIntent = Intent(this , ActivityName.class)
            startActivity(myIntent)

        }

    }
}