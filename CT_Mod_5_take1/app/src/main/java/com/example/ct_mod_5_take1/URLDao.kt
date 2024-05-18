package com.example.ct_mod_5_take1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface URLDao {
    @Insert
    fun insertImage(vararg id: URLEntity)
    @Query("SELECT URL FROM URLEntity WHERE imageNum = :imageNum")
    fun getURL(imageNum: Int): String
    @Query("SELECT MAX(imageNum) FROM URLEntity")
    fun getMax(): Int
    @Query("SELECT * FROM URLEntity")
    fun getAll(): List<URLEntity>
    @Query("SELECT * FROM URLEntity WHERE imageNum = :imageNum")
    fun exists(imageNum: Int): Boolean
    @Query("DELETE FROM URLEntity WHERE imageNum = :imageNum")
    fun  deleteOne(imageNum: Int)
    @Query("DELETE FROM URLEntity")
    fun deleteAll()

}