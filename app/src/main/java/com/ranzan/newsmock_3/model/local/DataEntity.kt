package com.ranzan.newsmock_3.model.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ranzan.newsmock_3.model.remote.ArticlesItem


@Entity(tableName = "offline data")
data class DataEntity(
    @PrimaryKey
    @ColumnInfo(name = "article")
    var articlesItem: ArticlesItem
)