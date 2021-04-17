package com.ltts.database


import androidx.room.Database

import androidx.room.RoomDatabase

@Database(entities = [Entity::class],version = 1)
abstract class Signindb : RoomDatabase(){



    abstract fun dao() :Dao
}





