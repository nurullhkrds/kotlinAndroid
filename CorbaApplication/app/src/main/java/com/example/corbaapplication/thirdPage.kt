package com.example.corbaapplication

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class thirdPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        var sk1=findViewById<SeekBar>(R.id.seekBar1)
        var sk2=findViewById<SeekBar>(R.id.seekBar2)
        var siparisVerr=findViewById<Button>(R.id.siparisVer)
        var editT=findViewById<EditText>(R.id.editTextTextPersonName)


        var sarim=findViewById<Switch>(R.id.sw1)
        var nane=findViewById<Switch>(R.id.sw2)
        var dil=findViewById<Switch>(R.id.sw3)
        var terbiye=findViewById<Switch>(R.id.sw4)
        var beyin=findViewById<Switch>(R.id.sw5)
        var sirke=findViewById<Switch>(R.id.sw6)
        var krema=findViewById<Switch>(R.id.sw7)
        var yag=findViewById<Switch>(R.id.sw8)
        var kasar=findViewById<Switch>(R.id.sw9)
        var kitir=findViewById<Switch>(R.id.sw10)
        var limon=findViewById<Switch>(R.id.sw11)
        var tozbib=findViewById<Switch>(R.id.sw12)




        var value1=""
        var value2=""
        var mezeIstek=""
        var ekstraIstek=""

        var ucuncuyazi=findViewById<TextView>(R.id.thirdtext)
        var ikincidenalinan=intent.getStringExtra("aktarilacaksey" )
        ucuncuyazi.text=" $ikincidenalinan Çorbası"

        sk1.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1==2){
                    val uyari=AlertDialog.Builder(this@thirdPage)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu Kadar Tuzlu istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.images)
                    uyari.setPositiveButton("Evet"){ DialogInterface,i->
                        Toast.makeText(applicationContext,"Bol Tuzlu Çorba",Toast.LENGTH_SHORT).show()

                    }
                    uyari.setNegativeButton("Hayır"){DialogInterface,i->
                        sk1.progress=1

                    }
                    uyari.create().show()

                }

                value1=p1.toString()

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {




            }

        })
     sk2.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1==2){
                    val uyari=AlertDialog.Builder(this@thirdPage)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu Kadar Acılı istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.a1)
                    uyari.setPositiveButton("EVET"){ DialogInterface,i->
                        Toast.makeText(applicationContext,"Bol Acılı Çorba",Toast.LENGTH_SHORT).show()

                    }
                    uyari.setNegativeButton("HAYIR"){DialogInterface,i->
                        sk2.progress=1


                    }
                    uyari.create().show()

                }
                value2=p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })


        if(ikincidenalinan.toString()=="Ezogelin"){
            dil.visibility=View.INVISIBLE
            sirke.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            nane.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Düğün"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE


        }
        else if(ikincidenalinan.toString()=="Mercimek"){
            krema.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            tozbib.visibility=View.INVISIBLE
            sirke.visibility=View.INVISIBLE
            tozbib.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Brokoli"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            terbiye.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Kelle-Paça"){
            sirke.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            krema.visibility=View.INVISIBLE
            tozbib.visibility=View.INVISIBLE
            nane.visibility=View.INVISIBLE


        }
        else if(ikincidenalinan.toString()=="Yayla"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE
            sarim.visibility=View.INVISIBLE
            nane.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Şehriye"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            terbiye.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE
            sarim.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Domates"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE
            sarim.visibility=View.INVISIBLE
            nane.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Tarhana"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            beyin.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            sarim.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Mantar"){
            dil.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            kasar.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            sirke.visibility=View.INVISIBLE
            sarim.visibility=View.INVISIBLE
            nane.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="İşkembe"){
            krema.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            sirke.visibility=View.INVISIBLE
            nane.visibility=View.INVISIBLE
            tozbib.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            sarim.visibility=View.INVISIBLE

        }
        else if(ikincidenalinan.toString()=="Tavuk"){
            nane.visibility=View.INVISIBLE
            yag.visibility=View.INVISIBLE
            krema.visibility=View.INVISIBLE
            kitir.visibility=View.INVISIBLE
            terbiye.visibility=View.INVISIBLE
            limon.visibility=View.INVISIBLE
            tozbib.visibility=View.INVISIBLE



        }

        println(ucuncuyazi.text.toString())



        siparisVerr.setOnClickListener {





            if(!(editT.text==null)){
                ekstraIstek=editT.text.toString()
            }
            if(editT.text==null){
                editT.visibility=View.INVISIBLE
            }




            val uyari=AlertDialog.Builder(this)
            uyari.setTitle("Siparişinizin Durumu")
            uyari.setMessage("Siparişiniz Hazırlanacak.Devam Etmek istiyor musunuz?")
            uyari.setIcon(R.drawable.indir)
            uyari.setPositiveButton("Evet"){DialogInterface,i->
                if (sarim.isChecked == true)
                {
                    mezeIstek ="$mezeIstek"+sarim.text.toString()
                }
                if (nane.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+nane.text.toString()
                }
                if (dil.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+dil.text.toString()
                }
                if (terbiye.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+terbiye.text.toString()
                }
                if (beyin.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+beyin.text.toString()
                }
                if (sirke.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+sirke.text.toString()
                }
                if (krema.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+krema.text.toString()
                }
                if (yag.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+yag.text.toString()
                }
                if (kasar.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+kasar.text.toString()
                }
                if (kitir.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+kitir.text.toString()
                }
                if (limon.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+limon.text.toString()
                }
                if (tozbib.isChecked == true)
                {
                    mezeIstek ="$mezeIstek,"+tozbib.text.toString()
                }

                Handler().postDelayed({
                    var dortgecis= Intent(this,fourthPage::class.java)
                    dortgecis.putExtra("aktarilacaksey",value1)
                    dortgecis.putExtra("aktarilacaksey1",value2)
                    dortgecis.putExtra("aktarilacaksey2",ucuncuyazi.text)
                    dortgecis.putExtra("meze",mezeIstek)
                    dortgecis.putExtra("ekstra",ekstraIstek)
                    startActivity(dortgecis)
                    finish()
                },2000)

            }

            uyari.setNeutralButton("TEKRAR KONTROL ETMEK İSTİYORUM"){DialogInterface,i->


            }
            uyari.create().show()

        }
    }
}