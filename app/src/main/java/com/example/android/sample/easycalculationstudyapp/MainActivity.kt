package com.example.android.sample.easycalculationstudyapp

import android.content.Intent
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

            //選択したアイテムを入手
            val numberOfQuestion : Int = spinner.selectedItem.toString().toInt()

            val intent = Intent(this@MainActivity, TestActivity::class.java)
            intent.putExtra("numberOfQuestion", numberOfQuestion)
            startActivity(intent)
        }
    }
}
