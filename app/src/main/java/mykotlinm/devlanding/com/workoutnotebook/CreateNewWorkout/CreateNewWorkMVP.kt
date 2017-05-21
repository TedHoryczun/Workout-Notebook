package mykotlinm.devlanding.com.workoutnotebook.CreateNewWorkout

/**
 * Created by ted on 5/19/17.
 */
interface CreateNewWorkMVP{
    interface view{

    }
    interface preseneter{

        fun createWorkout(workoutTitle: String, workoutDescription: String)
    }
}
