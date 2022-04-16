package com.example.textlistener

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                try {
                    val size : Int = count.text.toString().toInt()
                    result.text = (size * 2).toString()

                } catch (nfe: NumberFormatException) {
                    result.text = null
                }
            }
            override fun afterTextChanged(p0: Editable?) {

            }
        })
    }
}