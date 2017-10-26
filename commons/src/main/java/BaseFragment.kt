import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tho.com.commons.R

/**
 * Created by carlos on 26/10/17.
 */
abstract class BaseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(getLayoutRedId(), container, false)
        return view
    }

    abstract fun getLayoutRedId(): Int
}