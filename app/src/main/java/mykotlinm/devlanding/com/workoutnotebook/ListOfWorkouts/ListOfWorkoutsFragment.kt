package mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.fragment_list_of_workouts.*
import mykotlinm.devlanding.com.workoutnotebook.CreateNewWorkout.CreateNewWorkoutFragment
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.longToast


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ListOfWorkoutsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ListOfWorkoutsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListOfWorkoutsFragment : android.support.v4.app.Fragment(), ListOfWorkoutsMVP.view {
    override fun startCreateNewWorkoutFragment() {
        val fragment: Fragment = CreateNewWorkoutFragment.newInstance("", "")
        EventBus.getDefault().post(fragment)

    }

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    private var mListener: mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.Companion.ARG_PARAM1)
            mParam2 = arguments.getString(mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.Companion.ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?,
                              savedInstanceState: android.os.Bundle?): android.view.View? {
        // Inflate the layout for this fragment
        var view = inflater!!.inflate(mykotlinm.devlanding.com.workoutnotebook.R.layout.fragment_list_of_workouts, container, false)
        return view;
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var presenter: ListOfWorkoutsPresenter = ListOfWorkoutsPresenter(this)
        presenter.initRecyclerView()

       createWorkoutButton.setOnClickListener({presenter.createNewWorkout()})


    }

    override fun initRecyclerView() {
        listOfWorkouts.layoutManager = LinearLayoutManager(context)
        listOfWorkouts.setHasFixedSize(true)
        var workout1 = Workout("Monday",
                mutableListOf(Exercise("Row", 50, 2), Exercise("Deadlift", 200, 4)))

        var workouts = mutableListOf(workout1)
        listOfWorkouts.adapter = Adapter(workouts, context)
    }
    fun onButtonPressed(uri: android.net.Uri) {
        if (mListener != null) {
            mListener!!.onFragmentInteraction(uri)
        }
    }

    override fun onAttach(context: android.content.Context?) {
        super.onAttach(context)
        if (context is mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.OnFragmentInteractionListener) {
            mListener = context as mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.OnFragmentInteractionListener?
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: android.net.Uri)
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.

         * @param param1 Parameter 1.
         * *
         * @param param2 Parameter 2.
         * *
         * @return A new instance of fragment ListOfWorkoutsFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment {
            val fragment = mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment()
            val args = android.os.Bundle()
            args.putString(mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.Companion.ARG_PARAM1, param1)
            args.putString(mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment.Companion.ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}// Required empty public constructor
