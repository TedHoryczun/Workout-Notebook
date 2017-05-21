package mykotlinm.devlanding.com.workoutnotebook

import android.support.annotation.NonNull

/**
 * Created by ted on 5/19/17.
 */
class Workout {
    var id: String =""
    var title: String = ""
    var description: String = ""
    var exercises: MutableList<Exercise> = mutableListOf()

    constructor(title: String, description: String) {
        this.title = title
        this.description = description
    }

}

