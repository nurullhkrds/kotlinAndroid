package com.example.final_rgb_023

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class spinner : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_spinner, container, false)
        var spiner: Spinner = view.findViewById(R.id.spinner)
        var sekme = arrayOf("Süre Seçiniz", "2sn", "2.5sn", "3sn", "3.5sn", "4sn")
        val stake = layoutInflater.inflate(R.layout.fragment_spinner, null)
        stake.findViewById<Spinner>(R.id.spinner)
        var edit1:EditText=view.findViewById(R.id.editTextTextPersonName3)
        var edit2:EditText=view.findViewById(R.id.editTextTextPersonName4)


        var adapter = ArrayAdapter(stake.context, android.R.layout.simple_dropdown_item_1line, sekme)

        spiner.adapter = adapter



        spiner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                Snackbar.make(spiner ,"${edit1.text}",Snackbar.LENGTH_LONG)
                    .setAction("${edit2.text}"){
                        Toast.makeText(spiner.context,"${edit2.text}",Toast.LENGTH_SHORT).show()

                    }.show()

                if (sekme[p2] == "2sn"){
                    Snackbar.make(spiner ,"${edit1.text}",2000)
                        .setAction("${edit2.text}"){
                            Toast.makeText(spiner.context,"${edit2.text}",Toast.LENGTH_SHORT).show()

                        }.show()
                } else if(sekme[p2] == "2.5sn"){
                    Snackbar.make(spiner ,"${edit1.text}",2500)
                        .setAction("${edit2.text}"){
                            Toast.makeText(spiner.context,"${edit2.text}",Toast.LENGTH_SHORT).show()

                        }.show()
                } else if (sekme[p2] == "3sn"){
                    Snackbar.make(spiner ,"${edit1.text}",3000)
                        .setAction("${edit2.text}"){
                            Toast.makeText(spiner.context,"${edit2.text}",Toast.LENGTH_SHORT).show()

                        }.show()
                } else if (sekme[p2] == "3.5sn"){
                    Snackbar.make(spiner ,"${edit1.text}",3500)
                        .setAction("${edit2.text}"){
                            Toast.makeText(spiner.context,"${edit2.text}",Toast.LENGTH_SHORT).show()

                        }.show()
                }else if (sekme[p2] == "4sn"){
                    Snackbar.make(spiner ,"${edit1.text}",4000)
                        .setAction("${edit2.text}"){
                            Toast.makeText(spiner.context,"${edit2.text}",Toast.LENGTH_SHORT).show()
                        }.show()
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }

        return view
    }

}