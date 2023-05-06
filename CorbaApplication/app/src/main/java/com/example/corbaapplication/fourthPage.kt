package com.example.corbaapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class fourthPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_page)

        var fourText1=findViewById<TextView>(R.id.fourtext1)
        var fourYazi2=findViewById<TextView>(R.id.fourtext2)
        var fourYazi3=findViewById<TextView>(R.id.fourtext3)
        var exitButton=findViewById<ImageButton>(R.id.imageButton2)
        var fouryYazi4=findViewById<TextView>(R.id.editText1)

        var message1 = ""
        var message2=""

        var fourYazi=findViewById<TextView>(R.id.fourtext1)



        var corbaName=intent.getStringExtra("aktarilacaksey2")
        var messageAci=intent.getStringExtra("aktarilacaksey1")
        var messageTuz=intent.getStringExtra("aktarilacaksey" )

        if (messageAci=="2"){
            message2= "Bol Acılı"
        }
        else if (messageAci=="1"){
            message2="Az Acılı"
        }
        else{
            message2="Acısız"
        }


        if (messageTuz=="2"){
             message1= "Bol Tuzlu"
        }
        else if (messageTuz=="1"){
             message1="Az Tuzlu"
        }
        else{
             message1="Tuzsuz"
        }
        fourYazi.text="Bir ${corbaName.toString()}  Çeeek, ${message1.toString()} ve ${message2.toString()}"

        var ekstra=intent.getStringExtra("ekstra")
        var meze=intent.getStringExtra("meze")

        if (meze==""){
            fourYazi2.visibility=View.INVISIBLE
        }
        else{

            fourYazi2.text="İÇİNDE \n \n $meze \n \n Olsun \n"
        }


        if (ekstra==""){
            fouryYazi4.visibility=View.INVISIBLE
        }
        else{
            fouryYazi4.text="Ekstra İstek:$ekstra"


        }


        var sayac=0


        fun yakSondur() {
            Handler().postDelayed({

                if (sayac == 0) {
                    fourYazi3.setTextColor(Color.BLACK)
                    sayac++
                } else {
                    fourYazi3.setTextColor(Color.WHITE)
                    sayac--
                }
                yakSondur()


            }, 1000)
        }
        yakSondur()

        fourYazi3.setOnClickListener {

            Handler().postDelayed({
                var yeniSiparis= Intent(this,secondPage::class.java)
                startActivity(yeniSiparis)
                finish()
            },500)

        }

        exitButton.setOnClickListener {

            finishAffinity()
            System.exit(0)


        }










    }
}