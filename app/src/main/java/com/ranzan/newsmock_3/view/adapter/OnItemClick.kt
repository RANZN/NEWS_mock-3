package com.ranzan.newsmock_3.view.adapter

import com.ranzan.newsmock_3.model.remote.ArticlesItem

interface OnItemClick {
    fun onClick(articlesItem: ArticlesItem)
}