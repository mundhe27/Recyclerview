package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private lateinit var Foodadapter : Foodadapter



    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()



            foodList.add(Food(R.drawable.paneer_butter_masala , name = "Paneer masala"))
            foodList.add(Food(R.drawable.pizza , name = "Pizza"))
            foodList.add(Food(R.drawable.dosa , name = "Dosa"))
            foodList.add(Food(R.drawable.veg_biryani , name = "Veg Biryni"))
            foodList.add(Food(R.drawable.pasta , name = "Pasta"))
            foodList.add(Food(R.drawable.noodles, name = "Noodles"))






        Foodadapter = Foodadapter(foodList)
        recyclerView.adapter = Foodadapter


    }
}
