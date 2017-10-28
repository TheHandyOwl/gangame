package tho.com.gangame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object { // Si queremos que la variable esté disponible en otras partes del código
        val DEFAULT_OPTION = R.id.action_deals
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navigationView.selectedItemId = R.id.action_deals
        //navigationView.selectedItemId = MainActivity.DEFAULT_OPTION
        navigationView.selectedItemId = DEFAULT_OPTION

    }
}
