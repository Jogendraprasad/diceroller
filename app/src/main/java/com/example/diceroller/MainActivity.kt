package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var inage :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // to revoke the super class and execute it
        setContentView(R.layout.activity_main)// to set the content
        inage=findViewById(R.id.dice__images)
        val rollbutton:Button=findViewById(R.id.rolling) // button is an inbuilt class not made by user
        rollbutton.text="roll"    // text is present in the inbuilt class Button
        val mar:TextView=findViewById(R.id.teext)
        mar.text="dice"
        rollbutton.setOnClickListener{
            // Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()// toast is an singleton object ,
        // make test is func which returns Toast,show is func
           rolldice()

        }



    }

    private fun rolldice() {
       //var resulttext :TextView=findViewById(R.id.teext)
        var ranint= (1..6).random()
       // resulttext.text=ranint.toString()
       // val inage :ImageView=findViewById(R.id.dice__images)  findviewbyid is an expensive operation so we are
        val drawablkere=when(ranint)                            // implementing using  a lateintit keyword
        {
            1-> R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else-> R.drawable.empty_dice
        }
        inage.setImageResource(drawablkere)

    }
}