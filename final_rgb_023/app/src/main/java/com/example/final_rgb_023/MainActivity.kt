package com.example.final_rgb_023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sk1=findViewById<SeekBar>(R.id.seekBar2)


        sk1.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if(p1==1000){
                    var tasarim=layoutInflater.inflate(R.layout.toast,null)
                    var toast= Toast(applicationContext)
                    toast.view=tasarim
                    toast.duration= Toast.LENGTH_SHORT
                    toast.show()
                    object: CountDownTimer(2000,1000){
                        override fun onTick(p0: Long) {

                        }

                        override fun onFinish() {
                            var loginGecis= Intent(applicationContext,loginPace::class.java)
                            startActivity(loginGecis)
                            finish()

                        }

                    }.start()

                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

                sk1.progress=0

            }

        })



    }



}