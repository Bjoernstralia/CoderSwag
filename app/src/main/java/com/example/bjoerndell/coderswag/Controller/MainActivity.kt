package com.example.bjoerndell.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.bjoerndell.coderswag.Adapters.CategoryAdapter
import com.example.bjoerndell.coderswag.Model.Category
import com.example.bjoerndell.coderswag.R
import com.example.bjoerndell.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoriesListView.adapter = adapter



        /*
        categoriesListView.setOnItemClickListener { adapterView, view, i, l ->
            val listItemName = DataService.categories[i]
            Toast.makeText(this,"selected ${listItemName.title}", Toast.LENGTH_SHORT).show()
        }
        */

    }


}
