package mykotlinm.devlanding.com.workoutnotebook.Database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by ted on 5/19/17.
 */
class DbHelper(val context: Context){
    val database: Database = Database(context)
    val db: SQLiteDatabase? = database.writableDatabase

    fun insert(table: String, values: ContentValues){
        db?.insert(table, null, values)
    }

}
