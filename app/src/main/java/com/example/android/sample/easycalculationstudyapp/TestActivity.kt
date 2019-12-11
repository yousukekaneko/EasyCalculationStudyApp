package com.example.android.sample.easycalculationstudyapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val bundle = intent.extras
        val numberOfQuestion : Int = bundle.getInt("numberOfQuestion")
        textViewRemaining.text = numberOfQuestion.toString()


        checkAnswer.setOnClickListener {
            answerChack()
        }

        buttonReturn.setOnClickListener{

        }

        number0.setOnClickListener(this)
        number1.setOnClickListener(this)
        number2.setOnClickListener(this)
        number3.setOnClickListener(this)
        number4.setOnClickListener(this)
        number5.setOnClickListener(this)
        number6.setOnClickListener(this)
        number7.setOnClickListener(this)
        number8.setOnClickListener(this)
        number9.setOnClickListener(this)
        minus.setOnClickListener(this)
        clearButton.setOnClickListener(this)

        question()


    }

    private fun question() {
        buttonReturn.isEnabled = false

        checkAnswer.isEnabled = true
        number0.isEnabled = true
        number1.isEnabled = true
        number2.isEnabled = true
        number3.isEnabled = true
        number4.isEnabled = true
        number5.isEnabled = true
        number6.isEnabled = true
        number7.isEnabled = true
        number8.isEnabled = true
        number9.isEnabled = true
        minus.isEnabled = true
        clearButton.isEnabled = true
    }

    private fun answerChack() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
