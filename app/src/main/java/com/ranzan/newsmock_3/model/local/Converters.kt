package com.ranzan.newsmock_3.model.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.ranzan.newsmock_3.model.remote.Source

@ProvidedTypeConverter
class Converters {

    @TypeConverter
    fun fromArticle(source: Source): String {
        return (source.name + "**" + source.id).toString()
    }

    @TypeConverter
    fun toArticle(source: String): Source {
        val d = source.split("**")
        return Source(d[0], d[1])
    }
}