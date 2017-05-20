package mykotlinm.devlanding.com.workoutnotebook

import ninja.sakib.pultusorm.annotations.AutoIncrement
import ninja.sakib.pultusorm.annotations.PrimaryKey

/**
 * Created by ted on 5/19/17.
 */
class Exercise{
    @PrimaryKey
    @AutoIncrement
    var id: Int = 0
    var name: String = ""
    var sets: Int = 0
    var reps: Int = 0
    var weight: Int = 0
}
