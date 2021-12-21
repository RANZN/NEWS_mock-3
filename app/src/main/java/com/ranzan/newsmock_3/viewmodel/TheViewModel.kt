package com.ranzan.newsmock_3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ranzan.newsmock_3.model.Repo
import com.ranzan.newsmock_3.model.remote.ArticlesItem

class TheViewModel(private val repo: Repo) : ViewModel() {

    fun getData(): LiveData<List<ArticlesItem>> {
        return repo.getDataFromApi()
    }
}

class ViewModelFactory(private val repo: Repo) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TheViewModel(repo) as T
    }
}