package com.example.aboutmegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    val fruitsList = listOf<String>("apple","banana","orange","mango","lemon","guava")
    val fruitsList = listOf<Fruit>(
    Fruit("apple",10),
    Fruit("banana",20),
    Fruit("orange",23),
    Fruit("mango",10),
    Fruit("lemon",15),
    Fruit("guava",10)
   )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(fruitsList)
    }
}