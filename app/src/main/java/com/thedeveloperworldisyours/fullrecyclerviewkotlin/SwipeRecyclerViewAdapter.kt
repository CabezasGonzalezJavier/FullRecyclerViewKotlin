package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.swipe_list_item.view.*

/**
 * Created by javierg on 22/08/2017.
 */

class SwipeRecyclerViewAdapter (private val arrayList: ArrayList<MyItem>,
                                private val context: Context,
                                private val layout: Int) : RecyclerView.Adapter<SwipeRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeRecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: SwipeRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(items: MyItem) {
            itemView.swipe_list_item_title.text = items.getTitle()
            itemView.swipe_list_item_subtitle.text = items.getSubTitle()
        }

    }

}