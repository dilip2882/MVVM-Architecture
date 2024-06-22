package com.dilip.listadapterexample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.programmingList)
        val adapter = ProgrammingAdapter()

        val p1 =  ProgarmmingItem(1, "A", "Android")
        val p2 =  ProgarmmingItem(2, "K", "Kotlin")
        val p3 =  ProgarmmingItem(3, "J", "Java")

        adapter.submitList(listOf(p1, p2, p3))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            val p3 =  ProgarmmingItem(3, "J", "Java")
            val p4 =  ProgarmmingItem(4, "R", "Rust")
            val p5 =  ProgarmmingItem(5, "G", "GoLang")
            val p6 =  ProgarmmingItem(6, "H", "Haskel")

            adapter.submitList(listOf(p3, p4, p5, p6))

        }, 4000)
    }
}