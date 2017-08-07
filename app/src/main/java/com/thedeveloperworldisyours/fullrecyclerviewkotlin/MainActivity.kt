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
        (news_list.adapter as NewsAdapter).addNews(getData())
    }

    private  fun getData():List<RedditNewsItem> {
        var news: List<RedditNewsItem>
        for () {

        }

            return news
    }

}
