package com.example.ct_mod_5_take1

import androidx.room.Database
import androidx.room.RoomDatabase
import java.net.URL

@Database(entities = arrayOf(
    URLEntity::class), version = 1
)
abstract class Database : RoomDatabase() {
    abstract fun URLDao(): URLDao
}