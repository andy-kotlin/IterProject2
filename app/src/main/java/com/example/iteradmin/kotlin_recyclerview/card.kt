package com.example.iteradmin.kotlin_recyclerview

class card(thumbnail:String,title:String,subtitle:String) {
    private val thumnail:String
    private val title:String
    private val subtitle:String
    init{
        this.thumnail=thumbnail
        this.title=title
        this.subtitle=subtitle
    }
    fun getThumbnial():String{
        return this.thumnail
    }

    fun getsubTitle():String
    {
        return this.subtitle
    }

    fun gettitle():String{
        return this.title
    }
}