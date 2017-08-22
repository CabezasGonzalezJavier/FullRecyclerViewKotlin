package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.swipe_activity.*

class SwipeActivity : AppCompatActivity() {

    private var myAdapter: SwipeRecyclerViewAdapter? = null
    private var arrayList: ArrayList<MyItem>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swipe_activity)

        if (getSupportActionBar() != null) {
            getSupportActionBar()?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_action_bar))
        }

        initialize()
        setupList()
        loadData()

    }

    private fun loadData() {

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
        layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        myAdapter = SwipeRecyclerViewAdapter(arrayList!!, this, R.layout.swipe_list_item)

    }
}
