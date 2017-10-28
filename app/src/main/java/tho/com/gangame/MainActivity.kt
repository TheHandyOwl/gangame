// Main Activity

package tho.com.gangame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import tho.com.gangame.deals.DealsFragment
import tho.com.gangame.owned.TopOwnedFragment
import tho.com.gangame.rated.TopRatedFragment


class MainActivity : AppCompatActivity() {

    companion object { // Si queremos que la variable esté disponible en otras partes del código
        const val DEFAULT_OPTION = R.id.action_deals
    }

    val fragments: HashMap<Int, Fragment> = hashMapOf(
            Pair(R.id.action_deals, DealsFragment()),
            Pair(R.id.action_top_rated, TopRatedFragment()),
            Pair(R.id.action_most_owned, TopOwnedFragment())
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        //navigationView.selectedItemId = R.id.action_deals
        //navigationView.selectedItemId = MainActivity.DEFAULT_OPTION
        navigationView.selectedItemId = DEFAULT_OPTION
        navigationView.setOnNavigationItemSelectedListener { item ->
            //item.itemId
            //fragments.get(item.itemId)
            //fragments[item.itemId]
            val fragment: Fragment? = fragments[item.itemId]

            // Si ya existe el fragmento lo reemplaza
            if (fragment != null)
                replaceFragment(fragment)

            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
    }

    fun initView() {
        val currentFragment = supportFragmentManager
                .findFragmentById(R.id.fragmentContainer)

        // Si no existe el fragmento lo creamos
        if(currentFragment == null)
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainer, fragments[DEFAULT_OPTION])
                    .commit()
    }
}