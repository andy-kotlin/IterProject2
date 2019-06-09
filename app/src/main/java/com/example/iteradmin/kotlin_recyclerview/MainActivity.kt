package com.example.iteradmin.kotlin_recyclerview

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.album_card.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val re = findViewById<RecyclerView>(R.id.recycleview)

        val lm: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recycleview.layoutManager = lm


        val data = arrayOf(card("https://cdn-02.independent.ie/incoming/article37836050.ece/ad1ba/BINARY/tos_33937471_l_Cosmos.jpg", "Flower"),
                card("https://images7.alphacoders.com/100/1003760.jpg", "Super Hero"),
                card("https://images2.alphacoders.com/442/442877.jpg","Cricketer"))


        recycleview.adapter = MyAdapter(this, data)

        val th = findViewById<ImageView>(R.id.thumbnail)




    }
}
