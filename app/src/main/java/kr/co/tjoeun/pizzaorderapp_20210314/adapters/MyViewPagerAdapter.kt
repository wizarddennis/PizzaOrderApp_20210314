package kr.co.tjoeun.pizzaorderapp_20210314.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizzaorderapp_20210314.fragments.MyProfileFragment
import kr.co.tjoeun.pizzaorderapp_20210314.fragments.PizzaStoresFragment

class MyViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoresFragment()
            else -> MyProfileFragment()
        }
    }



}