package com.thedeveloperworldisyours.fullrecyclerviewkotlin

/**
 * Created by javierg on 02/08/2017.
 */
class RedditNewsItem(val names : String) {

    val name: String

    init {
        this.name = names
    }

    operator fun  invoke(fruit: String?) {}

    /*fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }*/
}