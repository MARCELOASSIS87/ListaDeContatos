package com.everis.listadecontatos.bases

import android.database.sqlite.SQLiteDatabase
import com.everis.listadecontatos.helpers.HelperDB

open class BaseRepository(
    val helperDB: HelperDB? = null
) {
    val readableDataBase: SQLiteDatabase?
        get() {
            return helperDB?.readableDatabase
        }
    val writableDataBase: SQLiteDatabase?
        get() {
            return helperDB?.writableDatabase
        }
}