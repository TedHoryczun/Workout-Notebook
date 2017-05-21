package mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import mykotlinm.devlanding.com.workoutnotebook.R
import mykotlinm.devlanding.com.workoutnotebook.Workout
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

/**
 * Created by ted on 5/15/17.
 */
class Adapter(var workouts: MutableList<Workout>, var context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(workouts[position]) {
            holder.numExercises.text = "${exercises.size} Exercises"
            holder.title.text = title
        }
    }

    override fun getItemCount(): Int {
        return workouts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.workout_row, parent, false)
        return ViewHolder(view, context)
    }

    class ViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.find<TextView>(R.id.title)
        val numExercises = itemView.find<TextView>(R.id.numExercises)
        init{
            itemView.setOnClickListener { context.toast("clicked") }
        }
    }

}
