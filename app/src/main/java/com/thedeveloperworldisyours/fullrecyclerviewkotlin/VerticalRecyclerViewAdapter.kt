package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.View


/**
 * Created by javierg on 14/08/2017.
 */
class VerticalRecyclerViewAdapter internal constructor(private val mDataset: ArrayList<VerticalData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    internal class DataObjectHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var mLabel: TextView
        var mDateTime: TextView

        init {
            mLabel = itemView.findViewById(R.id.vertical_list_item_title) as TextView
            mDateTime = itemView.findViewById(R.id.vertical_list_item_subtitle) as TextView
            itemView.setOnClickListener(this)
        }

        fun onClick(v: View) {
            sClickListener!!.onItemClick(adapterPosition, v)
        }
    }

    internal fun setOnItemClickListener(myClickListener: VerticalRecyclerViewAdapter.MyClickListener) {
        this.sClickListener = myClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): VerticalRecyclerViewAdapter.DataObjectHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_list_item, parent, false)

        val dataObjectHolder = DataObjectHolder(view)
        return dataObjectHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.mLabel.text = mDataset[position].getmTitle()
        holder.mDateTime.text = mDataset[position].getmSubTitle()
    }
    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getViewType()
    }
    internal fun addItem(dataObj: VerticalData, index: Int) {
        mDataset.add(dataObj)
        notifyItemInserted(index)
    }

    internal fun deleteItem(index: Int) {
        mDataset.removeAt(index)
        notifyItemRemoved(index)
    }

    override fun getItemCount(): Int {
        return mDataset.size
    }

    internal interface MyClickListener {
        fun onItemClick(position: Int, v: View)
    }

    companion object {
        private var sClickListener: VerticalRecyclerViewAdapter.MyClickListener? = null
    }

}