package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonCal = findViewById<Button>(R.id.buttonCalculate) as Button

        buttonCal.setOnClickListener{
            calPayment()
        }

    }
    fun calPayment(){

        val spinAge = findViewById<Spinner>(R.id.spinnerAge)
        val age = spinAge.selectedItemPosition + 1


        val radioGGender = findViewById<RadioGroup>(R.id.radioGroupGender)
        val genderGroup = radioGGender.checkedRadioButtonId
        val radioGender = findViewById<RadioButton>(genderGroup)
        val gender = radioGender.text.toString()


        val cBoxSmoker = findViewById<CheckBox>(R.id.checkBoxSmoker)
        val isSmoker = cBoxSmoker.isChecked

        var prem =0
        if(age == 1) {
            prem += 60
        }
        else if (age == 2) {
            prem += 70

            if (gender.equals("Male")) {
                prem += 50
            }

            if (isSmoker) {
                prem += 100
            }

        }
        else if (age == 3) {
            prem += 90

            if (gender.equals("Male")) {
                prem += 100
            }

            if (isSmoker) {
                prem += 150
            }

        }
        else if (age == 4) {
            prem += 120

            if (gender.equals("Male")) {
                prem += 150
            }

              if (isSmoker) {
                prem += 200
            }

        }
        else if (age == 5) {
            prem += 150

            if (gender.equals("Male")) {
                prem += 200
            }

            if (isSmoker) {
                prem += 250
            }

        }
        else if (age == 6) {
            prem += 150

            if (gender.equals("Male")) {
                prem += 200
            }

            if (isSmoker) {
                prem += 300
            }

        }
        textViewPremium.setText(String.format("Total insurence premium:" + prem.toString()))

    }
}
