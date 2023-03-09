package com.zebdul.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var myRecyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myRecyclerView = findViewById(R.id.recyclerView)
        val newsImageArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
        )
        val newsHeadingArray = arrayOf(
            "Teachers’ scam: CBI meeting on Friday to determine fresh line of probe",
            "Khattar: Gurdwaras to be managed by Haryana Sikh Gurdwara Parbandhak Committee ",
            "Mirabai Chanu: Weightlifter is BBC Indian Sportswoman of the Year",
            "K-Dramas: Korean dramas and Bollywood are more similar than you think",
            "Manish Sisodia: India anti-corruption crusader fighting to clear his name",
            "War: Ukraine war casts shadow over G20 foreign ministers' meeting in India",
            "Amritpal Singh: The self-styled preacher raising fears in India's Punjab",
            "KARNATAKA ELECTION 2023: BJP Won't Cross 65-Seat Mark In Karnataka Assembly To 40",
        )
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf()
        for (index in newsImageArray.indices) {
            val news = News(newsHeadingArray[index], newsImageArray[index])
            newsArrayList.add(news)
        }
        myRecyclerView.adapter = MyAdapter(newsArrayList, this)
    }
}