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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun answerChack() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
