package com.example.android.sample.easycalculationstudyapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test.*
import kotlin.random.Random

class TestActivity : AppCompatActivity(), View.OnClickListener {

    var numberOfRemaining = 0
    var numberOfCorrect = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val bundle = intent.extras
        val numberOfQuestion : Int = bundle.getInt("numberOfQuestion")
        textViewRemaining.text = numberOfQuestion.toString()
        numberOfCorrect = 0

        numberOfRemaining = numberOfQuestion


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

        val leftInt = Random.nextInt(100) + 1
        val rightInt = Random.nextInt(100) + 1
        textViewLeft.text = leftInt.toString()
        textViewRight.text = rightInt.toString()

        when(Random.nextInt(2) + 1) {
            1 -> textViewOperator.text = "+"
            2 -> textViewOperator.text = "-"
        }

        textViewAnswer.text = ""

        imageView.visibility = View.VISIBLE
    }

    private fun answerChack() {
        buttonReturn.isEnabled = false
        checkAnswer.isEnabled = false
        number0.isEnabled = false
        number1.isEnabled = false
        number2.isEnabled = false
        number3.isEnabled = false
        number4.isEnabled = false
        number5.isEnabled = false
        number6.isEnabled = false
        number7.isEnabled = false
        number8.isEnabled = false
        number9.isEnabled = false
        minus.isEnabled = false
        clearButton.isEnabled = false

        numberOfRemaining -= 1
        textViewRemaining.text = numberOfRemaining.toString()

        imageView.visibility = View.VISIBLE

        val intMyAnswer : Int = textViewAnswer.text.toString().toInt()

        val intTrueAnswer : Int =
            if (textViewOperator.text == "+") {
                textViewLeft.text.toString().toInt() + textViewRight.text.toString().toInt()
            } else {
                textViewLeft.text.toString().toInt() - textViewRight.text.toString().toInt()
            }

        if (intMyAnswer == intTrueAnswer) {
            numberOfCorrect += 1
            textViewCorrect.text = numberOfCorrect.toString()
            imageView.setImageResource(R.drawable.pic_correct)

        } else {
            imageView.setImageResource(R.drawable.pic_incorrect)
        }

    }

    override fun onClick(v: View?) {

        val button : Button = v as Button

        when (v?.id) {
            R.id.clearButton -> textViewAnswer.text = ""

            R.id.minus -> if (textViewAnswer.text.toString() == "") {
                textViewAnswer.text = "-"
            }

            R.id.number0 -> if (textViewAnswer.text.toString() != "0" && textViewAnswer.text.toString() != "-") {
                textViewAnswer.append(button.text)
            }

            else
                -> if (textViewAnswer.text.toString() == "0") {
                textViewAnswer.text = button.text
            } else {
                textViewAnswer.append(button.text)
            }

        }
    }
}
