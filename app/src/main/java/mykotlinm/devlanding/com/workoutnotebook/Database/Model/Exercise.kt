package mykotlinm.devlanding.com.workoutnotebook.Database.Model


/**
 * Created by ted on 5/19/17.
 */
class Exercise{
    var id: String =""
    var name: String = ""
    var sets: Int = 0
    var reps: Int = 0
    var weight: Int = 0
    constructor(name: String, reps: Int, sets: Int){
        this.name = name
        this.reps = reps
        this.sets = sets
    }
}
