package mykotlinm.devlanding.com.workoutnotebook

import mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.Exercise
import ninja.sakib.pultusorm.annotations.AutoIncrement
import ninja.sakib.pultusorm.annotations.PrimaryKey

/**
 * Created by ted on 5/19/17.
 */
class Workout{
   @PrimaryKey
   @AutoIncrement
   var id: Int = 0
   var title: String = ""
   var description: String = ""
   var exercises: MutableList<Exercise> = mutableListOf()
}

