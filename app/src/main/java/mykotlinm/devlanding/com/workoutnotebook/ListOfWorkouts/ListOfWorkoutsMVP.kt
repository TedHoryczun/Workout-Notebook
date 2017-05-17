package mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts

/**
 * Created by ted on 5/15/17.
 */
interface ListOfWorkoutsMVP {
    interface view {
        fun initRecyclerView()
        fun startCreateNewWorkoutFragment()

    }

    interface presenter {
        fun initRecyclerView()
        fun createNewWorkout()

    }
}
