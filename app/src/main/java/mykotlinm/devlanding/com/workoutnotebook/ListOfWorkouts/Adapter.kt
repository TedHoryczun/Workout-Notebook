package mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import mykotlinm.devlanding.com.workoutnotebook.R
import org.jetbrains.anko.find

/**
 * Created by ted on 5/15/17.
 */
class Adapter(var workouts: ArrayList<Workout>, var context: Context): RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(workouts[position]){
            holder.numExercises.text = "${exercises.size} Exercises"
            holder.title.text = title
        }

    }

    override fun getItemCount(): Int {
        return workouts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.workout_row, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.find<TextView>(R.id.title)
        val numExercises = itemView.find<TextView>(R.id.numExercises)
    }

}
