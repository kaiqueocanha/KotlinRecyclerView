package com.ocanha.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var liveAdapter: LiveAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()

    }

    private fun initRecyclerView() {

        liveAdapter = LiveAdapter()

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = liveAdapter
        }

    }

    private fun addDataSource() {

        val dataSource = DataSource.createDataSet()
        liveAdapter.setList(dataSource)

    }

}