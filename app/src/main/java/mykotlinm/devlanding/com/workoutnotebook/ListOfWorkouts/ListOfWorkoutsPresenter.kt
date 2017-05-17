package mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts

/**
 * Created by ted on 5/15/17.
 */
class ListOfWorkoutsPresenter(var view: ListOfWorkoutsMVP.view): ListOfWorkoutsMVP.presenter {
    override fun createNewWorkout() {
        view.startCreateNewWorkoutFragment();
    }

    override fun initRecyclerView(){
        view.initRecyclerView()
    }
}
