package mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts

/**
 * Created by ted on 5/15/17.
 */
interface ListOfWorkoutsMVP{
    interface view{
        fun initRecyclerView()

    }
    interface presenter{
       fun initRecyclerView()

    }
}
