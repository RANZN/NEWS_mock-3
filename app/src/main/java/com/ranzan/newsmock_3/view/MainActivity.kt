package com.ranzan.newsmock_3.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ranzan.newsmock_3.R
import com.ranzan.newsmock_3.databinding.ActivityMainBinding
import com.ranzan.newsmock_3.model.Repo
import com.ranzan.newsmock_3.model.local.DataDao
import com.ranzan.newsmock_3.model.local.TheDatabase
import com.ranzan.newsmock_3.model.remote.ArticlesItem
import com.ranzan.newsmock_3.view.adapter.OnItemClick
import com.ranzan.newsmock_3.view.adapter.RecyclerViewAdapter
import com.ranzan.newsmock_3.viewmodel.TheViewModel
import com.ranzan.newsmock_3.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity(), OnItemClick {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: TheViewModel
    private lateinit var repo: Repo
    private lateinit var dataDao: DataDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        dataDao = TheDatabase.getDatabaseInstance(this).getDao()
        repo = Repo(dataDao)

        viewModel = ViewModelProvider(this, ViewModelFactory(repo)).get(TheViewModel::class.java)

        val dataList = ArrayList<ArticlesItem>()
        viewModel.getData().observe(this@MainActivity, Observer {
            val list = it as ArrayList<ArticlesItem>
            list.forEach {
                Log.d("list2", it.toString())
            }
            setRecyclerView(list)
        })
    }

    private fun setRecyclerView(list: ArrayList<ArticlesItem>) {
        binding.progressBar.visibility = View.GONE
        val recyclerAdapter = RecyclerViewAdapter(list, this)
        binding.recyclerView.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }


    override fun onClick(articlesItem: ArticlesItem) {
        val intent = Intent(MainActivity@ this, MainActivity2::class.java)
//        intent.putExtra("data", articlesItem)
        startActivity(intent)
    }
}