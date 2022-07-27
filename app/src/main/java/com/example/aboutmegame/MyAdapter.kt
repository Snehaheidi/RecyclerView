package com.example.aboutmegame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val fruitList: List<Fruit>): RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view){
        fun bind(fruit: Fruit) {
            val textview = view.findViewById<TextView>(R.id.textView)
            textview.text = fruit.name

            view.setOnClickListener {
                Toast.makeText(view.context,"selected fruit name ${fruit.name}",Toast.LENGTH_SHORT).show()
            }
        }
    }
//    val fruitList = listOf<String>("apple","banana","orange","mango","lemon","guava")

    // onCreateViewHolder -> RecyclerView calls this method when you need a new view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

          //Inflater -> reading xml file to translate them in java code...you access all of the views within it.
           val layoutInflate = LayoutInflater.from(parent.context)
           val listItem = layoutInflate.inflate(R.layout.each_iem,parent,false)

         return ItemViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.bind(fruit)

//        holder.textview.text = fruit.name

      //holder.textview.text = "hi everyone $position"
    }

    override fun getItemCount(): Int {
      //return 10
        return fruitList.size
    }

}