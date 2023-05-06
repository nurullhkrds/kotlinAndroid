package com.example.corbaapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buyutulecekyazi=findViewById<TextView>(R.id.textView2)

        buyutulecekyazi.setTextSize(0.0f)


        object: CountDownTimer(2000,1){
            override fun onTick(p0: Long) {

                var size=(2000-p0)/30
                if (size<50){
                    buyutulecekyazi.setTextSize((size).toFloat())
                    Thread.sleep(20)
                }

            }

            override fun onFinish() {
                var ilkSayfayaGecis=Intent(applicationContext,firstPage::class.java)
                startActivity(ilkSayfayaGecis)
                finish()
            }

        }.start()
    }
}