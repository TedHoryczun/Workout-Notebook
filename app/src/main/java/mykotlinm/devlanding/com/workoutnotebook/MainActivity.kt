package mykotlinm.devlanding.com.workoutnotebook

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import mykotlinm.devlanding.com.workoutnotebook.ListOfWorkouts.ListOfWorkoutsFragment

class MainActivity : AppCompatActivity(), MainMVP.view, ListOfWorkoutsFragment.OnFragmentInteractionListener{

    private var presenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        presenter.displayListOfWorkouts()
    }

    override fun displayListOfWorkoutsFragment() {
        val fragment: Fragment = ListOfWorkoutsFragment();
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment).commit()

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
