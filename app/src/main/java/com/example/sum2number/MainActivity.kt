package com.example.sum2number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.SumNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println(SumNumber.Sum(2,4))
    }
}