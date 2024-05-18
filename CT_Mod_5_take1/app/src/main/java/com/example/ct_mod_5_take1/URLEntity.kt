package com.example.ct_mod_5_take1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "URLEntity")
data class URLEntity(
    @PrimaryKey(autoGenerate = false) var imageNum: Int,
    @ColumnInfo(name = "URL") var URL: String
)
