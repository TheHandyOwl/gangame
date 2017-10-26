package tho.com.gangame.deals

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tho.com.gangame.R

/**
 * Created by carlos on 25/10/17.
 */

class DealsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_deals, container, false)
        return view
    }

}
