package com.thedeveloperworldisyours.fullrecyclerviewkotlin

/**
 * Created by javierg on 14/08/2017.
 */
class VerticalData internal constructor(private var mTitle: String?, private var mSubTitle: String?) {

    fun getmTitle(): String? {
        return mTitle
    }

    fun setmTitle(mTitle: String) {
        this.mTitle = mTitle
    }

    fun getmSubTitle(): String? {
        return mSubTitle
    }

    fun setmSubTitle(mSubTitle: String) {
        this.mSubTitle = mSubTitle
    }
}