package com.ranzan.newsmock_3.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ranzan.newsmock_3.R
import com.ranzan.newsmock_3.databinding.ItemViewBinding
import com.ranzan.newsmock_3.model.local.DataEntity
import com.ranzan.newsmock_3.model.remote.ArticlesItem

class RecyclerViewAdapter(
    private val list: ArrayList<ArticlesItem>,
    private val onnItemClick: OnItemClick
) :
    RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemViewBinding: ItemViewBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_view, parent, false)
        return RecyclerViewHolder(itemViewBinding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindData(list[position], onnItemClick)
    }

    override fun getItemCount(): Int = list.size
}

class RecyclerViewHolder(private val itemViewBinding: ItemViewBinding) :
    RecyclerView.ViewHolder(itemViewBinding.root) {
    fun bindData(articlesItem: ArticlesItem, onnItemClick: OnItemClick) {
        itemViewBinding.item = articlesItem
    }
}