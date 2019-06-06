package com.example.iteradmin.kotlin_recyclerview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val re=findViewById<RecyclerView>(R.id.recycleview)

        val lm:RecyclerView.LayoutManager=LinearLayoutManager(this)
        recycleview.layoutManager=lm



        val data= arrayOf(card("one","two","three"), ("XYZ"))


        recycleview.adapter=MyAdapter(this)
    }
}
