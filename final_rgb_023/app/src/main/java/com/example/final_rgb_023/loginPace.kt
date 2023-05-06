package com.example.final_rgb_023

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged


class loginPace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_pace)




        var preferences = getSharedPreferences("", MODE_PRIVATE)
        var duzgunPre = preferences.edit()

        var name_text = findViewById<TextView>(R.id.editText1)
        var parola_text = findViewById<TextView>(R.id.editText2)



        var switch = findViewById<Switch>(R.id.switch2)
        var kullanici ="nurullah kardas"
        var parola ="02200201023"

        var tick1 = false
        var tick2 = false

        var transform1 = Intent(this, menuFirstPage::class.java)
        fun gecis_fonk()
        { Handler().postDelayed({
            duzgunPre.putString(kullanici,name_text.text.toString())
            duzgunPre.putString(parola,parola_text.text.toString())
            duzgunPre.putString("isCheckedSwc",switch.isChecked.toString())
            duzgunPre.apply()
            startActivity(transform1)
        },5000)

        }

        if(preferences.getString("isCheckedSwc","false")=="true")
        {
            name_text.text = preferences.getString(kullanici,"").toString()
            parola_text.text = preferences.getString(parola,"").toString()
            switch.isChecked=true
            tick1 = true
            tick2 = true


            gecis_fonk()

            Toast.makeText(applicationContext," Kaydedilmiş \n İsim: $kullanici  \n Şifre: $parola \n Unutma: True ",Toast.LENGTH_SHORT).show()

        }
        else{

            name_text.doOnTextChanged(){ charSequence: CharSequence?, i: Int, i1: Int, i2: Int ->
                if(kullanici==charSequence.toString()) {
                    tick1 =true
                }

                if(tick1==true && tick2==true)
                {
                    gecis_fonk()
                }
            }

            parola_text.doOnTextChanged(){ charSequence: CharSequence?, i: Int, i1: Int, i2: Int ->
                if(parola==charSequence.toString()) {
                    tick2 =true
                }

                if(tick1==true && tick2==true)
                {
                    gecis_fonk()
                }
            }
            Toast.makeText(applicationContext," Kaydedilmiş \n İsim: Değer Yok  \n Şifre: Değer \n Unutma: False ",Toast.LENGTH_SHORT).show()

        }

    }
}