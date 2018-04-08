package com.example.bjoerndell.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.bjoerndell.coderswag.Adapters.CategoryAdapter
import com.example.bjoerndell.coderswag.Adapters.CategoryRecycleAdapter
import com.example.bjoerndell.coderswag.Model.Category
import com.example.bjoerndell.coderswag.R
import com.example.bjoerndell.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter: CategoryAdapter
    lateinit var recycleAdapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycleAdapter = CategoryRecycleAdapter(this, DataService.categories)
        categoriesListView.adapter = recycleAdapter

        val layoutManager = LinearLayoutManager(this)
        categoriesListView.layoutManager = layoutManager
        categoriesListView.setHasFixedSize(true)

    }


}
