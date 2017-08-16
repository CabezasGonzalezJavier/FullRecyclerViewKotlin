package com.thedeveloperworldisyours.fullrecyclerviewkotlin

/**
 * Created by javierg on 14/08/2017.
 */
class MyItem internal constructor(private var title: String?, private var subtitle: String?) {

    fun getmTitle(): String? {
        return title
    }

    fun setmTitle(mTitle: String) {
        this.title = mTitle
    }

    fun getmSubTitle(): String? {
        return subtitle
    }

    fun setmSubTitle(mSubTitle: String) {
        this.subtitle = mSubTitle
    }
}