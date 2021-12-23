package com.ranzan.newsmock_3.model

import androidx.lifecycle.LiveData
import com.ranzan.newsmock_3.model.local.DataDao
import com.ranzan.newsmock_3.model.remote.ArticlesItem
import com.ranzan.newsmock_3.model.remote.Network
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repo(private val dataDao: DataDao) {


    fun getDataFromApi(): LiveData<List<ArticlesItem>> {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val list = Network.apiClient.getData().articles
                if (list != null) {
                    dataDao.deleteAllFromDb()
                }
                list!!.forEach {
                    dataDao.addData(it!!)
                }
            } catch (e: Exception) {

            }
        }
        return dataDao.getData()
    }
}