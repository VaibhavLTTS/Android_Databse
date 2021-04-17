package com.ltts.database

import androidx.room.Entity
import androidx.room.ColumnInfo
@Entity
 class Entity  {

    @ColumnInfo(name = "Name")
    var Name : String = ""

    @ColumnInfo(name = "Pass")
    var Pass: String = ""

    @ColumnInfo(name = "Email")
    var mail : String = ""

    @ColumnInfo(name = "mobile")
    var mobile : String = ""
}

