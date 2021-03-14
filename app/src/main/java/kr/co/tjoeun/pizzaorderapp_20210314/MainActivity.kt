package kr.co.tjoeun.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzaorderapp_20210314.adapters.MyViewPagerAdapter
import kr.co.tjoeun.pizzaorderapp_20210314.fragments.MyProfileFragment

class MainActivity : BaseActivity() {

    lateinit var mvpa : MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mvpa = MyViewPagerAdapter(supportFragmentManager)

        myViewPager.adapter = mvpa

    }
}