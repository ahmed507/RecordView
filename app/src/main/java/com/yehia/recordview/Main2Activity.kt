package com.yehia.recordview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Main2Activity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.list_item)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()


        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = ItemsAudAdapter(this)
    }
}
