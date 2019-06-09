package com.example.iteradmin.kotlin_recyclerview

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import java.net.HttpURLConnection

class MyAdapter1(context: Context,data:Array<card>) : RecyclerView.Adapter<MyAdapter1.myviewholder>() {
    private val m1Context: Context
    private val dataset1:Array<card>
    init {
        this.m1Context=context
        this.dataset1=data
    }



    class myviewholder(view: View): RecyclerView.ViewHolder(view)
    {
        val thumbnail: ImageView
        val title: TextView

        init {
            this.thumbnail=view.findViewById<ImageView>(R.id.thumbnail)
            this.title=view.findViewById<TextView>(R.id.title)

        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, position: Int):MyAdapter1.myviewholder
    {
        val rootview= LayoutInflater.from(parent.context).inflate(R.layout.album_card,null,true)


        return myviewholder(rootview)
    }

    override fun getItemCount(): Int
    {
        return 7
    }

    override fun onBindViewHolder(parent:MyAdapter1.myviewholder, position: Int) {
        Glide.with(m1Context).load(dataset1[position].getThumbnial()).into(parent.thumbnail)
        parent.title.text  = dataset1[position].gettitle()


        parent.thumbnail.setOnClickListener {

            val t=dataset1[position].gettitle()
            val imageGetter: String =dataset1[position].getThumbnial()

            val i: Intent = Intent(m1Context,MainActivity3::class.java)
            i.putExtra("img",imageGetter)
            i.putExtra("txt",t)

            m1Context.startActivity(i)
        }


    }

}