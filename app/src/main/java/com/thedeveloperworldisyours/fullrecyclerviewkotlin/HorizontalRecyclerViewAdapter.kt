package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.horizontal_item_cell.view.*

/**
 * Created by javierg on 21/08/2017.
 */
class HorizontalRecyclerViewAdapter(private val arrayList: ArrayList<MyItem>,
                                    private val context: Context,
                                    private val layout: Int) : RecyclerView.Adapter<HorizontalRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(items: MyItem) {
            itemView.horizontal_list_item_title.text = items.getTitle()
            itemView.horizontal_list_item_subtitle.text = items.getSubTitle()
        }
    }

}