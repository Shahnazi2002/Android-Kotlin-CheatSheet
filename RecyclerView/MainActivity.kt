package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var items = mutableListOf<DataClass>()
        items.add(DataClass("A", "1"))
        items.add(DataClass("B", "2"))
        items.add(DataClass("C", "3"))
        items.add(DataClass("D", "4"))

        var i = 5

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(this, items)
        binding.recyclerView.adapter = adapter

        binding.addButton.setOnClickListener {
            items.add(DataClass("New Item", "$i"))
            i++
            adapter.notifyDataSetChanged()
        }
    }
}