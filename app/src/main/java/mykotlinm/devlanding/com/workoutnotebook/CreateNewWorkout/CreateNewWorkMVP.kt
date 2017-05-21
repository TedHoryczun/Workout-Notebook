package mykotlinm.devlanding.com.workoutnotebook.CreateNewWorkout

/**
 * Created by ted on 5/19/17.
 */
interface CreateNewWorkMVP{
    interface view{
        fun startDisplayWorkoutFragment(uuidOfWorkout: String)

    }
    interface preseneter{

        fun createWorkout(workoutTitle: String, workoutDescription: String): String
        fun displayWorkout(uuidOfWorkout: String)
    }
}
