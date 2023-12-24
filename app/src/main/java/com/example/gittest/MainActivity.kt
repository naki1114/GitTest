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

        tv.text = "Oscar World"
        // 대충 주석 추가

        // 두번째 주석을 추가해버렷

        // naki test3

    }

    // naki test4
    fun nakiTest4() {
        tv.text = "Naki"
    }

}
