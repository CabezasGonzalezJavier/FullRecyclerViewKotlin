package com.thedeveloperworldisyours.fullrecyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(this)


        initAdapter()
    }

    private fun initAdapter() {


        if (news_list.adapter == null) {
            news_list.adapter = NewsAdapter()
        }
        (news_list.adapter as NewsAdapter).addNews()
    }


    private fun getData(): List<RedditNewsItem> {
        val numbers: MutableList<String> = mutableListOf("1", "2", "3")
        var fruits = resources.getStringArray(R.array.fruits_array)
        var news: List<RedditNewsItem> = ArrayList()
        var reddit: RedditNewsItem?
        var string = ""
        for (fruit in fruits) {
            string = fruit
            reddit(fruit)
            numbers.add(fruit)
            news[i]
        }

        return news
    }


//    private  fun getData():List<RedditNewsItem> {
//
//        var news : List<RedditNewsItem> = ArrayList()
//        val itemNews : RedditNewsItem
//        for (i in fruits) {
//            itemNews= RedditNewsItem(fruits.get(i))
//            news.add(itemNews)
//        }
//
//            return news
//    }

}
