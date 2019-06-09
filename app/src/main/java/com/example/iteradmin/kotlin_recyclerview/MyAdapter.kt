package com.example.iteradmin.kotlin_recyclerview

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.album_card.view.*

class MyAdapter(context: Context,data:Array<card>) : RecyclerView.Adapter<MyAdapter.myviewholder>()
{
    private val mContext:Context
    private val dataset:Array<card>
    init {
        this.mContext=context
        this.dataset=data
    }



    class myviewholder(view: View): RecyclerView.ViewHolder(view)
    {
        val thumbnail:ImageView
        val title:TextView

        init {
            this.thumbnail=view.findViewById<ImageView>(R.id.thumbnail)
            this.title=view.findViewById<TextView>(R.id.title)


        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, position: Int):MyAdapter.myviewholder
    {
        val rootview= LayoutInflater.from(parent.context).inflate(R.layout.album_card,null,true)


        return myviewholder(rootview)
    }

    override fun getItemCount(): Int
    {
       return 3
    }

    override fun onBindViewHolder(parent:MyAdapter.myviewholder, position: Int) {
        Glide.with(mContext).load(dataset[position].getThumbnial()).into(parent.thumbnail)
        parent.title.text  = dataset[position].gettitle()

        parent.thumbnail.setOnClickListener {
            val pos=parent.layoutPosition
            val i:Intent= Intent(mContext,MainActivity2::class.java)
            i.putExtra("pos",pos)
            mContext.startActivity(i)


        }





    }



}