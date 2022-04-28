package com.mamburuapps.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.mamburuapps.coderswag.R
import com.mamburuapps.coderswag.Services.DaraService
import com.mamburuapps.coderswag.adapters.CategoryAdapter
import com.mamburuapps.coderswag.adapters.categoryRecycleAdapter
import com.mamburuapps.coderswag.model.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: categoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = categoryRecycleAdapter(this, DaraService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager= layoutManager

        categoryListView.setHasFixedSize(true)




    }


}