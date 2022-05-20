package com.example.mycalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etTextnumber1: EditText
    lateinit var etTextnumber2: EditText
    lateinit var btnAdd: Button
    lateinit var btnMultiply: Button
    lateinit var tvResult: TextView
    lateinit var btnSubtract: Button
    lateinit var btnDivision: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivision= findViewById(R.id.btnDivision)
        etTextnumber1 = findViewById(R.id.etTextnumber1)
        etTextnumber2 = findViewById(R.id.etTextnumber2)
        btnAdd = findViewById(R.id.btnAdd)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var add = etTextnumber1.text.toString().toInt()
            var add2 = etTextnumber2.text.toString().toInt()
            Addition(add, add2)

        }
        btnSubtract.setOnClickListener {
            var add = etTextnumber1.text.toString().toInt()
            var add2 = etTextnumber2.text.toString().toInt()
            Subtraction(add, add2)

        }
        btnMultiply.setOnClickListener {
            var add = etTextnumber1.text.toString().toInt()
            var add2 = etTextnumber2.text.toString().toInt()
            Multiply(add, add2)

        }
        btnDivision.setOnClickListener {
            var add = etTextnumber1.text.toString().toInt()
            var add2 = etTextnumber2.text.toString().toInt()
            Division(add, add2)

        }
    }

    fun Multiply(add: Int, add2: Int) {
        var multiply = add * add2
        tvResult.text = multiply.toString()
    }

    fun Addition(add: Int, add2: Int) {
        var sum2 = add + add2
        tvResult.text = sum2.toString()
    }

    fun Subtraction(add: Int, add2: Int) {
        var subract = add - add2
        tvResult.text = subract.toString()
    }
    fun Division(add:Int, add2:Int){
        var modulars = add / add2
        tvResult.text = modulars.toString()
    }
}




