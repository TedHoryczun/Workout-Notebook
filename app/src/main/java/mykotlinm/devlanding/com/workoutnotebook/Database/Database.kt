package mykotlinm.devlanding.com.workoutnotebook.Database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by ted on 5/19/17.
 */
class Database(context: Context) : SQLiteOpenHelper(context, "workout.db", null, 1) {
    companion object {
        val WORKOUT_TABLE = "workout"
        val ID = "_id"
        val TITLE = "title"
        val DESCRIPTION = "description"

        val EXERCISE_TABLE = "exercise"
        val WORKOUT_ID = "workoutId"
        val NAME = "name"
        val SETS = "sets"
        val REPS = "reps"
        val WEIGHT = "weight"
    }

    private val WORKOUT_CREATE = "create table $WORKOUT_TABLE " +
            "($ID text primary key, $TITLE text, $DESCRIPTION text)"

    private val EXERCISE_CREATE = "create table $EXERCISE_TABLE" +
            "($ID INTEGER primary key autoincrement, $WORKOUT_ID text," +
            "$NAME text, $SETS INTEGER, $REPS INTEGER, $WEIGHT INTEGER)"

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(WORKOUT_CREATE)
        db?.execSQL(EXERCISE_CREATE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
