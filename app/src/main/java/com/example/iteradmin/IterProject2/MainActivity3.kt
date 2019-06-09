package com.example.iteradmin.IterProject2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val img=findViewById<ImageView>(R.id.image3)
        val text1=findViewById<TextView>(R.id.textView30)

        val but1=findViewById<Button>(R.id.button1)
        val but2=findViewById<Button>(R.id.button2)




        val i=intent

        val img1=i.getStringExtra("img")
        val text=i.getStringExtra("txt")

        Glide.with(this).load(img1).into(img)
        text1.setText(text)


        but1.setOnClickListener {  val x:Float=img.scaleX
            val y:Float=img.scaleY
            img.scaleX=x+1
            img.scaleY=y+1 }


        but2.setOnClickListener {
            val x:Float=img.scaleX
            val y:Float=img.scaleY
            img.scaleX=x-1
            img.scaleY=y-1 }


    }
}
