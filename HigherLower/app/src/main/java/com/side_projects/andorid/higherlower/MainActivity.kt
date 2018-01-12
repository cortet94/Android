package com.side_projects.andorid.higherlower

import android.support.v7.app.AppCompatActivity

import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

import java.util.*

class MainActivity : AppCompatActivity() {

    var randomNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        assignRandomNumber()

        createButtonListener()
    }


    fun generateRandomNumber():Int{
        var random = Random();

        var min = 1;

        var max = 10;

        randomNumber = random.nextInt(max + 1 - min) + min;

        return randomNumber;
    }

    fun assignRandomNumber(){
        randomNumber = generateRandomNumber()
    }

    fun guessNumber(){

        var numberToGuess = randomNumber

        var userGuess:Int = Integer.parseInt(numGuess.text.toString())

        checkUserGuess(userGuess, numberToGuess)


    }

    fun checkUserGuess(userGuess:Int, numberToGuess:Int) {

        if (userGuess > numberToGuess) {
            lblFeedback.setText("Too High")
        } else if (userGuess < numberToGuess) {
            lblFeedback.setText("Too Low")
        } else {
            lblFeedback.setText("Got it!")
        }
    }

    fun createButtonListener() {

        btnGuess.setOnClickListener {

            if (numGuess.text.equals("")) {
                toast("Please enter a Number")
            } else {
                guessNumber()
            }
        }
    }
}
