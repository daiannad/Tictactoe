package com.example.myapplication6

import android.graphics.Color
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity() : AppCompatActivity(), View.OnClickListener {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var buttonreset: Button
    var firstplayer = ArrayList<Int>()
    var secondplayer = ArrayList<Int>()
    var activePlayer = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        buttonreset = findViewById(R.id.resetbttn)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonreset.setOnClickListener(this)


    }

    override fun onClick(clickedView: View?) {

        if (clickedView is Button) {
            var buttonNumber = 0
            when (clickedView.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
                R.id.resetbttn -> buttonNumber = 10
            }
            if (buttonNumber != 0)
                playGame(clickedView, buttonNumber)

        }

    }

    fun playGame(view: Button, buttonNumber: Int) {

        if (activePlayer == 1) {
            view.text = "X"
            view.setBackgroundColor(Color.TRANSPARENT)
            firstplayer.add(buttonNumber)
            activePlayer = 2
        } else {
            view.text = "O"
            view.setBackgroundColor(Color.TRANSPARENT)
            secondplayer.add(buttonNumber)
            activePlayer = 1

        }
        view.isEnabled = false
        check()

    }

    private fun check() {
        TODO("Not yet implemented")
    }

    fun check(draw: Any) {
        var winner = 0
        if (firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)) {
            winner = 1
        }
        if (secondplayer.contains(1) && secondplayer.contains(2) && secondplayer.contains(3)) {
            winner = 2
        }
        if (firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)) {
            winner = 1
        }
        if (secondplayer.contains(4) && secondplayer.contains(5) && secondplayer.contains(6)) {
            winner = 2
        }
        if (firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {
            winner = 1
        }
        if (secondplayer.contains(7) && secondplayer.contains(8) && secondplayer.contains(9)) {
            winner = 2
        }
        if (firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)) {
            winner = 1
        }
        if (secondplayer.contains(1) && secondplayer.contains(5) && secondplayer.contains(9)) {
            winner = 2
        }
        if (firstplayer.contains(3) && firstplayer.contains(5) && firstplayer.contains(7)) {
            winner = 1
        }
        if (secondplayer.contains(3) && secondplayer.contains(5) && secondplayer.contains(7)) {
            winner = 2
        }
        if (firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)) {
            winner = 1
        }
        if (secondplayer.contains(2) && secondplayer.contains(5) && secondplayer.contains(8)) {
            winner = 2
        }
        if (firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {
            winner = 1
        }
        if (secondplayer.contains(3) && secondplayer.contains(6) && secondplayer.contains(9)) {
            winner = 2
        }
        if (firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)) {
            winner = 1
        }
        if (secondplayer.contains(1) && secondplayer.contains(4) && secondplayer.contains(7)) {
            winner = 2
        }

        fun checkIfTie() {
            if (!button1.isEnabled
                && !button2.isEnabled && !button3.isEnabled
                && !button4.isEnabled && !button5.isEnabled
                && !button6.isEnabled && !button7.isEnabled
                && !button8.isEnabled && !button9.isEnabled
            ) {

                Toast.makeText(this, "This Game Was A Tie!", Toast.LENGTH_LONG).show()

            }


            if (winner == 1) {
                Toast.makeText(this, "The first player is the winner", Toast.LENGTH_SHORT).show()

            } else if (winner == 2) {
                Toast.makeText(this, "The second player is the winner", Toast.LENGTH_SHORT).show()

            }

            buttonreset.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    button1.setText(" ")
                    button2.setText(" ")
                    button3.setText(" ")
                    button4.setText(" ")
                    button5.setText(" ")
                    button6.setText(" ")
                    button7.setText(" ")
                    button8.setText(" ")
                    button9.setText(" ")

                }
            })


        }
    }
}


