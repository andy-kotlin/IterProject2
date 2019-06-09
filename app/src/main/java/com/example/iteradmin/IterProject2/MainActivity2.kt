package com.example.iteradmin.IterProject2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val re=findViewById<RecyclerView>(R.id.recycleview1)

        val lm: RecyclerView.LayoutManager= GridLayoutManager(this,2)
        recycleview1.layoutManager=lm



        val flowers= arrayOf(card("https://images.pexels.com/photos/56866/garden-rose-red-pink-56866.jpeg","Rose"),
                card("https://images.pexels.com/photos/85773/pexels-photo-85773.jpeg","Gerbera"),
                card("https://images.pexels.com/photos/132472/pexels-photo-132472.jpeg","Lily"),
                card("https://images.pexels.com/photos/459335/pexels-photo-459335.jpeg","White Orchids"),
                card("https://images.pexels.com/photos/139396/lavender-flowers-blue-flowers-purple-139396.jpeg","Lavenders"),
                card("https://images.pexels.com/photos/1019475/spring-pink-tulip-flower-1019475.jpeg","Tulip"),
                card("https://images.pexels.com/photos/85679/aster-tongolensis-michelmas-daisy-mauve-flower-85679.jpeg","Aster"))
        val superheros= arrayOf(card("https://images7.alphacoders.com/997/997191.jpg", "Thor"),
                card("https://images4.alphacoders.com/969/969581.jpg","Iron Man"),
                card("https://images.alphacoders.com/997/997202.jpg","Captain America"),
                card("https://images5.alphacoders.com/997/997203.jpg","Black Widow"),
                card("https://images4.alphacoders.com/976/976247.jpg","Hulk"),
                card("https://images7.alphacoders.com/998/998459.jpg","Captain Marvel"),
                card("https://images.alphacoders.com/902/902378.jpg","Black Panther"))
        val cricketrs= arrayOf(card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170661/virat-kohli.jpg","Virat kohli"),
                card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170658/rohit-sharma.jpg","Rohit Sharma"),
                card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170635/david-warner.jpg","David Warner"),
                card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170643/mitchell-starc.jpg", "Mitchell Starc"),
                card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170733/kane-williamson.jpg","Kane Williamson"),
                card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170698/quinton-de-kock.jpg","Quinton de Kock"),
                card("https://www.cricbuzz.com/a/img/v1/152x152/i1/c170942/joe-root.jpg","Joe Root"))

         val i=intent


        if(i.hasExtra("pos"))
        {
            val pos:Int=i.getIntExtra("pos",0)
            if (pos==0)
            {
                recycleview1.adapter=MyAdapter1(this,flowers)
            }
            else if (pos==1)
            {
                recycleview1.adapter=MyAdapter1(this,superheros)
            }
            else if(pos==2)
            {
                recycleview1.adapter=MyAdapter1(this,cricketrs)
            }
        }


    }
}
