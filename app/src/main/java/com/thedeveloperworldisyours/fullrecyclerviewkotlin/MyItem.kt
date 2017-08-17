package com.thedeveloperworldisyours.fullrecyclerviewkotlin

/**
 * Created by javierg on 14/08/2017.
 */
class MyItem internal constructor(private var title: String?, private var subtitle: String?) {

    fun getTitle(): String? {
        return title
    }


    fun getSubTitle(): String? {
        return subtitle
    }

}