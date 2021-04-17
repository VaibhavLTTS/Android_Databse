package com.ltts.database


import androidx.room.Insert
import androidx.room.Query
import androidx.room.Dao


@Dao
     interface Dao{

@Insert
        fun insert(entity1 : Entity)
    @Query("select * from entity")
        fun view(): List<Entity>

    }
