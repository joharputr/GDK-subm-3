package com.example.submission2.SQLite

import android.provider.BaseColumns

class Base {
    class dataBaseSQl : BaseColumns {
        companion object {
            val TABLE_NAME = "GDK"
         //   val COLUMN_NAME_KEY = "keys"
            val COLUMN_NAME_TITLE = "title"
            val COLUMN_NAME_DESC = "description"

        }
    }
}