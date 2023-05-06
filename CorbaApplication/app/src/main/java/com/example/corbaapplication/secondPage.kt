package com.example.corbaapplication

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class secondPage : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        var cb=findViewById<CheckBox>(R.id.menu)
        var rg=findViewById<RadioGroup>(R.id.Rg)
        var devam=findViewById<Button>(R.id.buttonDevam)

        devam.visibility=View.INVISIBLE

        cb.setOnCheckedChangeListener { compoundButton, b ->

            if (b){
                rg.visibility=View.VISIBLE
                devam.visibility=View.VISIBLE
            }
            else{
                rg.visibility=View.INVISIBLE
                devam.visibility=View.INVISIBLE
            }

        }


        devam.setOnClickListener {



            var selectSoup=findViewById<RadioButton>(rg.checkedRadioButtonId)

            if (selectSoup==null){
                val uyari=AlertDialog.Builder(this)
                uyari.setTitle("UYARI!")
                uyari.setMessage("Lütfen Seçim Yapınız...")
                uyari.setIcon(R.drawable.indir)
                uyari.setNeutralButton("TEKRAR DENE"){DialogInterface,i->
                }
                uyari.create().show()


            }
            else{
                var tasarim=layoutInflater.inflate(R.layout.toastozel,null)

                var tostwrite=tasarim.findViewById<TextView>(R.id.texttost)
                tostwrite.text=" Güzel seçim \n ${selectSoup.text} Çorbası \n Lütfen Bekleyiniz "
                var tost_ozel=Toast(applicationContext)
                tost_ozel.view=tasarim
                tost_ozel.duration=Toast.LENGTH_SHORT
                tost_ozel.show()

                Handler().postDelayed({
                    var ucgecis=Intent(this,thirdPage::class.java)
                    ucgecis.putExtra("aktarilacaksey",selectSoup.text)
                    startActivity(ucgecis)
                    finish()

                },2000)

            }









        }


    }


}