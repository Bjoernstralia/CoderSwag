package com.example.bjoerndell.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.bjoerndell.coderswag.Model.Category
import com.example.bjoerndell.coderswag.R
import com.example.bjoerndell.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                DataService.categories)
        categoriesListView.adapter = adapter

    }


}
