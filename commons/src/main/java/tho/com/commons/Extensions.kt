package tho.com.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by carlos on 26/10/17.
 */

fun ViewGroup.inflate(layoutRedIs: Int, attachToRoot: Boolean = false): View {
    val inflater = LayoutInflater.from(context)

    return inflater.inflate(layoutRedIs, this, attachToRoot)

}