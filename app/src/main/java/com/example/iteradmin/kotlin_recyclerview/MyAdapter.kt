package com.example.iteradmin.kotlin_recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MyAdapter(context: Context) : RecyclerView.Adapter<MyAdapter.myviewholder>()
{
    private val mContext:Context
    init {
        this.mContext=context
    }



    class myviewholder(view: View): RecyclerView.ViewHolder(view)
    {
        val thumbnail:ImageView
        val title:TextView
        val subtitle:TextView
        init {
            this.thumbnail=view.findViewById<ImageView>(R.id.thumbnail)
            this.title=view.findViewById<TextView>(R.id.title)
            this.subtitle=view.findViewById<TextView>(R.id.subtitle)
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, position: Int):MyAdapter.myviewholder
    {
        val rootview= LayoutInflater.from(parent.context).inflate(R.layout.album_card,null,true)


        return myviewholder(rootview)
    }

    override fun getItemCount(): Int
    {
       return 10
    }

    override fun onBindViewHolder(parent:MyAdapter.myviewholder, position: Int) {
          parent.thumbnail.setImageResource(R.drawable.r)
        parent.title.setText("IRONMAN")
        parent.subtitle.setText("THE INVINCIBLE")

    }


}