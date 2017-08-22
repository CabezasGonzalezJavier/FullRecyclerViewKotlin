package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.content.Context
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.vertical_list_item.view.*

/**
 * Created by javierg on 14/08/2017.
 */
class VerticalRecyclerViewAdapter(private val arrayList: ArrayList<MyItem>,
                                  private val context: Context,
                                  private val layout: Int) : RecyclerView.Adapter<VerticalRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalRecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: VerticalRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(items: MyItem) {
            itemView.vertical_list_item_title.text = items.getTitle()
            itemView.vertical_list_item_subtitle.text = items.getSubTitle()
        }
    }

}