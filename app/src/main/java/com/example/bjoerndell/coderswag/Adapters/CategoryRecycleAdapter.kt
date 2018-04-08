package com.example.bjoerndell.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.bjoerndell.coderswag.Model.Category
import com.example.bjoerndell.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.CategoryHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false)

        return CategoryHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: CategoryHolder?, position: Int) {
        holder?.bindCategory(categories[position],context)
    }


    inner class CategoryHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory (category: Category, context: Context){
            val resId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            categoryImage?.setImageResource(resId)
            categoryName?.text = category.title
        }

    }
}