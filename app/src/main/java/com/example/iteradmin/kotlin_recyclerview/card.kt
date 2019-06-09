package com.example.iteradmin.kotlin_recyclerview

class card(thumbnail:String,title:String) {
    private val thumnail:String
    private val title:String

    init{
        this.thumnail=thumbnail
        this.title=title

    }
    fun getThumbnial():String{
        return this.thumnail
    }



    fun gettitle():String{
        return this.title
    }
}