package com.ranzan.newsmock_3.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ranzan.newsmock_3.R
import com.ranzan.newsmock_3.databinding.ActivityDetailedBinding
import com.ranzan.newsmock_3.model.remote.ArticlesItem

class DetailedActivity : AppCompatActivity() {
    private lateinit var detailedBinding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailedBinding = DataBindingUtil.setContentView(this, R.layout.activity_detailed)
        if (intent != null && intent.hasExtra("data")) {
            val data = intent.getSerializableExtra("data") as ArticlesItem
            detailedBinding.item = data
        }

        detailedBinding.backBtn.setOnClickListener {
            onBackPressed()
        }
    }
}