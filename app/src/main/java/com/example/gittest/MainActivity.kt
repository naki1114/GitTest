package com.example.gittest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv)

        nakiTest4()

        // 대충 주석 추가

        // naki test3
        // 테스트테스트테스트테스트테스트
        //테스트테스트테스트테스트테스트테스트

        nakiTest7()

    }

    // naki test4
    fun nakiTest4() {
        tv.text = "Naki4"
    }

    // naki test5
    fun nakiTest5() {
        tv.text = "Naki5"
    }

    // naki test7
    fun nakiTest7() {
        tv.text = "Naki7"
    }

}
