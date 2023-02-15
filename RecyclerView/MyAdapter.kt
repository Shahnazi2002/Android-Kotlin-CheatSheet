package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.RecyclerLayoutBinding

class MyAdapter(var context: Context, var items: MutableList<DataClass>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: RecyclerLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(RecyclerLayoutBinding.inflate(LayoutInflater.from(context), parent, false))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView.text = items[position].itemName
        holder.binding.textView2.text = items[position].itemDetail

        holder.binding.button.setOnClickListener {
            items.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = items.size
}