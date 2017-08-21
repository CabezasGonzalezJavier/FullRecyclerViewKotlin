package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_vertical.*

class HorizontalActivity : AppCompatActivity() {

    private var myAdapter: VerticalRecyclerViewAdapter? = null
    private var arrayList: ArrayList<MyItem>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horizontal)

        if (getSupportActionBar() != null) {
            getSupportActionBar()?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_action_bar))

//            getSupportActionBar()?.setStackedBackgroundDrawable(ContextCompat.getColor(this, android.R.color.transparent))
        }
        initialize()
        setupList()
        loaddata()
    }

    private fun loaddata() {

        for (i in 0..19) {
            val myItem = MyItem("Sid_" + i, "098899876" + i)
            arrayList!!.add(myItem)
        }

        myAdapter!!.notifyDataSetChanged()

    }

    private fun setupList() {
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = myAdapter
    }

    private fun initialize() {
        arrayList = ArrayList<MyItem>()
        layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        myAdapter = VerticalRecyclerViewAdapter(arrayList!!, this, R.layout.horizontal_item_cell)

    }
}
