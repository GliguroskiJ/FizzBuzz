package com.example.fizzbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var done_button : Button
lateinit var enter_number : EditText
lateinit var textView: TextView

var x = 0
var tri = 3
var pet = 5

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        done_button = findViewById(R.id.done_button)
        enter_number = findViewById(R.id.enter_number)
        textView = findViewById(R.id.textView)

        done_button.setOnClickListener(){
            try {
                x = enter_number.text.toString().toInt()
                if (x % tri == 0 && x % pet != 0){
                    textView.text = "Fizz"
                }
                else if(x % pet == 0 && x % tri != 0){
                    textView.text = "Buzz"
                }
                else if(x % tri == 0 && x % pet == 0){
                    textView.text = "FizzBuzz"
                }
                else{
                    textView.text = "Can't be divided by 3 or 5"
                }
            }catch (e:  NumberFormatException){
                textView.text = "Enter a number!"
            }
        }
    }
}