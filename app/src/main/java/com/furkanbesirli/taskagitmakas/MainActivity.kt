package com.furkanbesirli.taskagitmakas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var secimim = 0
    var randomSayi = Random.nextInt(1, 4)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(randomSayi)
    }
//1 tas 2 kagit 3 makas

    fun tas(view : View){
        secimim = 1
        secimim = 1
        if(randomSayi == 1){
            textView.text = "BERABERE!"
        }else if(randomSayi == 2){
            textView.text = "KAYBETTIN!"
        }else{
            textView.text = "KAZANDIN!"
        }
    }

    fun kagit(view : View){
        secimim = 2
        if(randomSayi == 1){
            textView.text = "KAZANDIN!"
        }else if(randomSayi == 2){
            textView.text = "BERABERE!"
        }else{
            textView.text = "KAYBETTIN!"
        }

    }

    fun makas(view : View){
        secimim = 3
        if(randomSayi == 1){
            textView.text = "KAYBETTIN!"
        }else if(randomSayi == 2){
            textView.text = "KAZANDIN!"
        }else{
            textView.text = "BERABERE!"
        }

    }


}