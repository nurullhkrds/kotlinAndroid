package com.example.corbaapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class firstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        var text1=findViewById<TextView>(R.id.text1)
        var text2=findViewById<TextView>(R.id.text2)
        var text3=findViewById<TextView>(R.id.text3)
        var text4=findViewById<TextView>(R.id.text4)
        var text5=findViewById<TextView>(R.id.text5)
        var text6=findViewById<TextView>(R.id.text6)


        var image1=findViewById<ImageView>(R.id.image1)
        var image2=findViewById<ImageView>(R.id.image2)
        var image3=findViewById<ImageView>(R.id.image3)
        var image4=findViewById<ImageView>(R.id.image4)
        var image5=findViewById<ImageView>(R.id.image5)
        var image6=findViewById<ImageView>(R.id.image6)


        text1.setOnClickListener {
            image1.visibility=View.VISIBLE


        }
        text2.setOnClickListener {
            if (image1.visibility==View.VISIBLE){
                image2.visibility=View.VISIBLE

            }
        }
        text3.setOnClickListener {

            if (image2.visibility==View.VISIBLE){
                image3.visibility=View.VISIBLE

            }
        }

        text4.setOnClickListener {

            if (image3.visibility==View.VISIBLE){
                image4.visibility=View.VISIBLE

            }
        }
        text4.setOnClickListener {
            if (image3.visibility==View.VISIBLE){
                image4.visibility=View.VISIBLE

            }
        }
        text5.setOnClickListener {
            if (image4.visibility==View.VISIBLE){
                image5.visibility=View.VISIBLE

            }
        }
        text6.setOnClickListener {
            if (image5.visibility==View.VISIBLE){
                image6.visibility=View.VISIBLE
                var tasarim=layoutInflater.inflate(R.layout.toastozel2,null)

                var tost_ozel2= Toast(applicationContext)
                tost_ozel2.view=tasarim
                tost_ozel2.duration= Toast.LENGTH_SHORT
                tost_ozel2.show()
                object: CountDownTimer(2000,1000){
                    override fun onTick(p0: Long) {

                    }

                    override fun onFinish() {
                        var ilkSayfayaGecis= Intent(applicationContext,secondPage::class.java)
                        startActivity(ilkSayfayaGecis)
                        finish()

                    }

                }.start()

            }


        }










    }
}