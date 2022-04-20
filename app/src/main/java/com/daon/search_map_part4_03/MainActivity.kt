package com.daon.search_map_part4_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import com.daon.search_map_part4_03.adapter.SearchRecyclerAdapter
import com.daon.search_map_part4_03.databinding.ActivityMainBinding
import com.daon.search_map_part4_03.model.LocationLatLngEntity
import com.daon.search_map_part4_03.model.SearchResultEntity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: SearchRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        initViews()
        initData()
        setData()
    }

    private fun initViews() = with(binding) {
        emptyResultTextView.isVisible = false
        recyclerView.adapter
    }

    private fun initAdapter() {
        adapter = SearchRecyclerAdapter()
    }

    private fun initData() {
        adapter.notifyDataSetChanged()
    }

    private fun setData() {
        val dataList = (0..10).map {
            SearchResultEntity(
                buildingName = "빌딩 $it",
                fullAdress = "주소 $it",
                locationLatLng = LocationLatLngEntity(
                    it.toFloat(),
                    it.toFloat()
                )
            )
        }
        adapter.setSearchResultList(dataList) {
            Toast.makeText(this, "빌딩이름 : ${it.buildingName} 주소  ${it.fullAdress}", Toast.LENGTH_SHORT).show()

        }
    }
}