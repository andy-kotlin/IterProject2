package com.example.iteradmin.IterProject2

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