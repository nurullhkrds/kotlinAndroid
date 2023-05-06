package com.example.final_rgb_023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.ProgressBar
import android.widget.Switch
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.doOnTextChanged

class menuFirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_first_page)
        val dizayn = layoutInflater.inflate(R.layout.dialog, null)



        var buton = findViewById<Button>(R.id.button)
        val birinciFrag = rgb()
        val ikinciFrag = spinner()
        var geri = Intent(this, loginPace::class.java)
        var progress = dizayn.findViewById<ProgressBar>(R.id.progressBar2)
        var main_swich = false

        val ok = findViewById<ImageView>(R.id.imageView3)


        object : CountDownTimer(10000,1){

            override fun onTick(p0: Long) {

                if(p0.toInt()%1000>500){
                    ok.setAlpha(1000)
                }else{
                    ok.setAlpha(0)
                }
            }
            override fun onFinish() {

            }
        }.start()


        fun exit() {

            progress.visibility = View.VISIBLE
            Handler().postDelayed({
                val geriTrue = Intent(applicationContext, loginPace::class.java)
                geriTrue.putExtra("controlSwc", main_swich)


                //main_dizayn.findViewById<Switch>(R.id.switch2)
                startActivity(geri)
            }, 2000)
        }
        buton.setOnClickListener {
            val acilirmenu = PopupMenu(this, buton)
            acilirmenu.menuInflater.inflate(R.menu.popup, acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i ->
                when (i.itemId) {
                    R.id.rgb -> {
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.frag, birinciFrag)
                            commit()
                        }

                        true
                    }
                    R.id.snackbar -> {
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.frag, ikinciFrag)
                            commit()
                        }


                        true  }
                    R.id.cikis -> {


                        val ad = AlertDialog.Builder(this@menuFirstPage)
                        var dialog_editisim =
                            dizayn.findViewById<EditText>(R.id.editTextTextPersonName)
                        var dialog_editsifre = dizayn.findViewById<EditText>(R.id.editTextTextPersonName2)

                        var dogrulama_1 = false
                        var dogrulama_2 = false

                        ad.setView(dizayn)



                        dialog_editisim.doOnTextChanged()
                        { charSequence: CharSequence?, i: Int, i1: Int, i2: Int ->
                            if ("nurullah kardas" == charSequence.toString()) {
                                dogrulama_1 = true
                            }


                            if (dogrulama_1 == true && dogrulama_2 == true) {
                                progress.visibility=View.VISIBLE
                                exit()
                            }
                        }

                        dialog_editsifre.doOnTextChanged()
                        { charSequence: CharSequence?, i: Int, i1: Int, i2: Int ->
                            if ("02200201023" == charSequence.toString()) {
                                dogrulama_2 = true
                            }


                            if (dogrulama_1 == true && dogrulama_2 == true) {
                                progress.visibility=View.VISIBLE
                                exit()
                            }
                        }

                        ad.create().show()

                        true }
                    else -> false

                }

            }
            acilirmenu.show()
        }
    }






}