package com.example.androlearn.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androlearn.R
import com.example.androlearn.adapters.ComponentsAdapter
import com.example.androlearn.models.Category
//import com.example.androlearn.models.Component

class CategoryItems : AppCompatActivity() {
    private lateinit var categoryItemsRV : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val categoryTitle : String? = intent.getStringExtra("title")
        val compList : ArrayList<String> = intent.getStringArrayListExtra("compList") as ArrayList<String>

        setContentView(R.layout.activity_category_items)

        Toast.makeText(this, ""+ compList[0], Toast.LENGTH_SHORT).show()
//        Toast.makeText(this, ""+ compList[1], Toast.LENGTH_SHORT).show()

        categoryItemsRV=findViewById(R.id.categoryItemsRV)
        var componentList: ArrayList<String> = ArrayList()
        componentList = compList

//        componentList.add(Component("$categoryTitle"))
//        componentList.add(Component("$categoryTitle"))
//        componentList.add(Component("$categoryTitle"))
        val componentItemsAdapter = ComponentsAdapter(componentList)
        categoryItemsRV.layoutManager = LinearLayoutManager(this)
        categoryItemsRV.adapter =componentItemsAdapter

    }
}