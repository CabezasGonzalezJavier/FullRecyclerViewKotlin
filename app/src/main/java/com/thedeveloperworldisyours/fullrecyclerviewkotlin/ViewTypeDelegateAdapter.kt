package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by javierg on 02/08/2017.
 */
interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}