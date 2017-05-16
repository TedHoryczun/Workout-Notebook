package mykotlinm.devlanding.com.workoutnotebook

/**
 * Created by ted on 5/15/17.
 */
class MainPresenter(var view: MainMVP.view): MainMVP.presenter{

    @Override
    fun displayListOfWorkouts(){
       view.displayListOfWorkoutsFragment()
    }
}
