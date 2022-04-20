package com.daon.search_map_part4_03.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daon.search_map_part4_03.R
import com.daon.search_map_part4_03.databinding.ViewholderSearchResultItemBinding

class SearchRecyclerAdapter: RecyclerView.Adapter<SearchRecyclerAdapter.SearchResultItemViewHolder>() {

    private var searchResultList: List<Any> = listOf()
    lateinit var searResultClickListener: (Any) -> Unit

    inner class SearchResultItemViewHolder(val binding: ViewholderSearchResultItemBinding, val searchResultClickListener: (Any) -> Unit) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: Any) = with(binding) {
            textTextView.text = "Title"
            subtextTextView.text = "subTitle"
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultItemViewHolder {
        val view = ViewholderSearchResultItemBinding.bind(parent)
        return SearchResultItemViewHolder(view, searResultClickListener)
    }

    override fun onBindViewHolder(holder: SearchResultItemViewHolder, position: Int) {
        holder.bindData(searchResultList[position])
    }

    override fun getItemCount(): Int = 10

}