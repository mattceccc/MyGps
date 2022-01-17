package com.bignerdranch.android.mygps

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(LocationEntity::class),version = 1)
abstract class MyRoomDatabase : RoomDatabase() {
    abstract fun locationDao(): LocationDao
}