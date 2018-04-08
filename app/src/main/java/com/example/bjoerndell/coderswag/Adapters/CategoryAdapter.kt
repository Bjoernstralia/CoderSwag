package com.example.bjoerndell.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.bjoerndell.coderswag.Model.Category
import com.example.bjoerndell.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.listview_item, null)

            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder //Was macht das genau?


        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val categories = categories[position]
        val catImage = context.resources.getIdentifier(categories.image, "drawable", context.packageName)
        val catName = categories.title

        holder.categoryImage?.setImageResource(catImage)
        holder.categoryName?.text = catName

        return categoryView
    }

    override fun getItem(position: Int): Any {
       return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder(){
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}