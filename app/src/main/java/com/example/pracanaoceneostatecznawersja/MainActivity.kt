package com.example.pracanaoceneostatecznawersja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var images= arrayOf(R.drawable.a,R.drawable.b,R.drawable.c)
    var index=0;
    fun silnia(s: Int): Long{
        if (s>=1)
            return s*silnia(s-1)
        else
            return 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView).setImageResource(images[index])

        findViewById<Button>(R.id.lewo).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(images[index])
            index -=1
            if(index<0)
            {
                index=images.size-1
            }
        }
        findViewById<Button>(R.id.prawo).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(images[index])
            index += 1
            if(index>images.size-1)
            {
                index=0
            }
        }

        findViewById<Button>(R.id.oblicz).setOnClickListener{
            var s=findViewById<EditText>(R.id.wpisz).text.toString().toInt()
            var x=silnia(s)
            findViewById<TextView>(R.id.wynik).text=x.toString()



        }

}
}
