package com.tutorial.eventpal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.firebaseapp.R

class LanguageAdapter(var mList: List<LanguageData>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logoVendor : ImageView = itemView.findViewById(R.id.vendorLogoIV)
        val titleVendor : TextView = itemView.findViewById(R.id.titleSearch)
    }

    fun setFilteredList(mList: List<LanguageData>){
        this.mList = mList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item , parent , false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.logoVendor.setImageResource(mList[position].logo)
        holder.titleVendor.text = mList[position].title
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}