package com.gebeya.begonet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gebeya.begonet.recycler.Model
import com.gebeya.begonet.recycler.MyAdapter
import kotlinx.android.synthetic.main.activity_volunteers.*

class Volunteers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteers)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Hanna Tilahun", "Elementary school teacher", R.drawable.profile_one))
        arrayList.add(Model("Belachew Belete", "Photographer, Tour Guide, chauffeur", R.drawable.profile_two))
        arrayList.add(Model("Melat Hailu", "Graphics Designer, Video Editor, Tv Host", R.drawable.profile_three))
        arrayList.add(Model("Solomon Zewdu", "Football player, Event Organizer", R.drawable.profile_four))
        arrayList.add(Model("Biniyam Teshome", "Singer, Writer, Drummer ", R.drawable.profile_five))
        arrayList.add(Model("Rahel Alemu", "Hair Stylist, Fashion Designer", R.drawable.profile_six))
        arrayList.add(Model("Robel Getnet", "Journalist, Radio Host, Language Translator (Chinese, Spanish, Arabic, English,Swahili", R.drawable.profile_seven))
        arrayList.add(Model("Sisay Asefa", "Public Speaker, Toast Master Member", R.drawable.profile_eight))
        arrayList.add(Model("Abenezer Abebe", "Heart Specialist, Web Article Writer", R.drawable.profile_nine))
        arrayList.add(Model("Kirubel Lemma", "Blogger, Works on my own Youtube Channel", R.drawable.profile_ten))
        arrayList.add(Model("Wubit Tesfaye", "Weeding Planner, Decor", R.drawable.profile_eleven))
        arrayList.add(Model("Saron Tigistu", "Artist, Painter, Model, Actor, Singer", R.drawable.profile_twelve))
        arrayList.add(Model("Yabisra Teshale", "Dentist, Volunteer at Love and Care", R.drawable.profile_thirteen))
        arrayList.add(Model("Eyasu Nigusie", "Mobile app Developer", R.drawable.profile_fourteen))
        arrayList.add(Model("Tariku Abraham", "Basketball player and Coach", R.drawable.profile_fifteen))
        arrayList.add(Model("Beza Tesema", "Entrepreneur, Business Manager, ", R.drawable.profile_sixteen))

        val myAdapter = MyAdapter(arrayList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}