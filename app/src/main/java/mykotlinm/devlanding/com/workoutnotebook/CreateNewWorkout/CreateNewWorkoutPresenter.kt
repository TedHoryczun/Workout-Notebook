package mykotlinm.devlanding.com.workoutnotebook.CreateNewWorkout

import android.content.ContentValues
import android.content.Context
import mykotlinm.devlanding.com.workoutnotebook.Database.Database.Companion.DESCRIPTION
import mykotlinm.devlanding.com.workoutnotebook.Database.Database.Companion.ID
import mykotlinm.devlanding.com.workoutnotebook.Database.Database.Companion.TITLE
import mykotlinm.devlanding.com.workoutnotebook.Database.Database.Companion.WORKOUT_TABLE
import mykotlinm.devlanding.com.workoutnotebook.Database.DbHelper
import mykotlinm.devlanding.com.workoutnotebook.Database.Model.Workout
import java.util.*

/**
 * Created by ted on 5/19/17.
 */

class CreateNewWorkoutPresenter(val view: CreateNewWorkMVP.view,
                                val context: Context) : CreateNewWorkMVP.preseneter {
    override fun displayWorkout(uuidOfWorkout: String) {
        view.startDisplayWorkoutFragment(uuidOfWorkout)
    }

    val db: DbHelper = DbHelper(context)


    override fun createWorkout(workoutTitle: String, workoutDescription: String): String {
        val workout = Workout(workoutTitle, workoutDescription)
        val values = ContentValues()
        val uuid: String = UUID.randomUUID().toString()

        with(workout) {
            values.put(TITLE, title)
            values.put(DESCRIPTION, description)
            values.put(ID, uuid)
        }
        db.insert(WORKOUT_TABLE, values)
        return uuid

    }
}
