package com.tutorial.eventpal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.firebaseapp.R

class HomeActivity: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: RecyclerView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        recyclerView = findViewById(R.id.RecyclerViewHome)
//        searchView = findViewById(R.id.searchView)
//
//        recyclerView.setHasFixedSize(true)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        addDataToList()
//        adapter = LanguageAdapter(mList)
//        recyclerView.adapter = adapter
//
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                filterList(newText)
//                return true
//            }
//
//        })
//    }
//
//    private fun filterList(query: String?) {
//
//        if (query != null) {
//            val filteredList = ArrayList<LanguageData>()
//            for (i in mList) {
//                if (i.title.lowercase(Locale.ROOT).contains(query)) {
//                    filteredList.add(i)
//                }
//            }
//
//            if (filteredList.isEmpty()) {
//                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
//            } else {
//                adapter.setFilteredList(filteredList)
//            }
//        }
//    }

//    private fun addDataToList(){
//
    }
}