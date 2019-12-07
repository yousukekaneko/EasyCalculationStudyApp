package com.example.android.sample.easycalculationstudyapp

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //選択肢を入れるためのArrayAdapterをセット
        val arrayAdapter = ArrayAdapter.createFromResource(this, R.array.number_of_question, android.R.layout.simple_spinner_item)

        //選択肢をスピナーにセット
        spinner.adapter = arrayAdapter

        button.setOnClickListener {
            val numberOfQuestion = spinner.selectedItem
        }
    }
}
