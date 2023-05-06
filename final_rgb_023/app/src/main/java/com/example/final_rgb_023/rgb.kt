package com.example.final_rgb_023

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView


class rgb : Fragment(R.layout.fragment_rgb) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_rgb,container,false)
        val redsk : SeekBar = view.findViewById(R.id.sk1)
        val greensk : SeekBar = view.findViewById(R.id.seekbar2)
        val bluesk : SeekBar = view.findViewById(R.id.seekbar3)

        val value : TextView = view.findViewById(R.id.textView3)
        var hexr = Integer.toHexString(0)
        var hexg = Integer.toHexString(188)
        var hexb = Integer.toHexString(212)

        if(hexr.toString()=="0"){
            hexr="00"
        }
        if(hexg.toString()=="0"){
            hexg="00"
        }
        if(hexb.toString()=="0"){
            hexb="00"
        }

        value.text = "#"+ hexr.toString() + hexg.toString() +hexb.toString()


        fun updateColor() {

            val red = redsk.progress
            val green = greensk.progress
            val blue = bluesk.progress
            val color = Color.argb(255, red, green, blue)

            hexr = Integer.toHexString(red)
            hexg = Integer.toHexString(green)
            hexb = Integer.toHexString(blue)

            if(hexr.toString()=="0"){
                hexr="00"
            }
            if(hexg.toString()=="0"){
                hexg="00"
            }
            if(hexb.toString()=="0"){
                hexb="00"
            }

            value.text = "#"+ hexr.toString() + hexg.toString() +hexb.toString()

            view.setBackgroundColor(color)
        }
        redsk.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {


                updateColor()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        greensk.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                updateColor()


            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        bluesk.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                updateColor()


            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })


        return view

    }
}