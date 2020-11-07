package com.gebeya.begonet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.gebeya.begonet.fragments.AboutFragment
import com.gebeya.begonet.fragments.HomeFragment
import com.gebeya.begonet.fragments.adapters.ViewPagerAdapter
import com.gebeya.begonet.framework.base.BaseActivity
import kotlinx.android.synthetic.main.activity_log_in_page.*
import kotlinx.android.synthetic.main.activity_main.*
const val PAGE_COUNT = 3
class MainActivity : BaseActivity(), ViewPager.OnPageChangeListener {

    internal lateinit var viewPager : ViewPager
    private lateinit var titles: Array<String>
    private lateinit var descriptions: Array<String>
    private lateinit var owner:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       signUpButton.setOnClickListener {
          val intent =  Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {

           val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
        }

        skipText.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        continueAsGuest.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }



      /*  viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val adapter= ViewPageAdapter(this)
        viewPager.adapter = adapter */


        titles = resources.getStringArray(R.array.welcome_titles)
        descriptions = resources.getStringArray(R.array.welcome_descriptions)
        owner = resources.getStringArray(R.array.project_owner)

        val images = arrayOf(
            R.drawable.kid,
            R.drawable.project_two,
            R.drawable.project_three
        )

        welcomeViewPager.adapter = WelcomePagerAdapter(
            supportFragmentManager, images
        )

        welcomeViewPager.addOnPageChangeListener(this)

/*
        val handler = Handler()
        val task = object: Runnable {
            override fun run() {
                moveNext()
                handler.postDelayed(this, 3000)
            }
        }
        handler.postDelayed(task, 3000)
*/
    }

    // Timer class

    fun moveNext() {
        val position = welcomeViewPager.currentItem
        val next = if (position == PAGE_COUNT - 1) {
            0
        } else {
            position + 1
        }

        welcomeViewPager.currentItem = next
    }

    override fun onPageScrollStateChanged(state: Int) = Unit

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
        val title = titles[position]
        val description = descriptions[position]
        val owner = owner[position]

        projectTitle.text = title
        descriptionProject.text = description
        projectOwner.text = owner
    }
}
