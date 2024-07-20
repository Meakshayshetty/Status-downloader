package com.akshay.statuscatch.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.akshay.statuscatch.fragment.FragmentImageAndVideo
import com.akshay.statuscatch.utils.Constants

class MediaViewPagerAdapter(
    private val fragmentActivity: FragmentActivity,
    private val imagesType: String = Constants.MEDIA_TYPE_WHATSAPP_IMAGES,
    private val videosType: String = Constants.MEDIA_TYPE_WHATSAPP_VIDEOS
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                // images media fragment
                val mediaFragment = FragmentImageAndVideo()
                val bundle = Bundle()
                bundle.putString(Constants.MEDIA_TYPE_KEY,imagesType)
                mediaFragment.arguments = bundle
                mediaFragment
            }
            else->{
                // videos media fragment
                val mediaFragment = FragmentImageAndVideo()
                val bundle = Bundle()
                bundle.putString(Constants.MEDIA_TYPE_KEY,videosType)
                mediaFragment.arguments = bundle
                mediaFragment
            }
        }
    }

}