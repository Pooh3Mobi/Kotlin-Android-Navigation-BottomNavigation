package mobi.pooh3.navigationinbottomnavigation.notification

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mobi.pooh3.navigationinbottomnavigation.R

import mobi.pooh3.navigationinbottomnavigation.home.dummy.DummyContent

/**
 */
class NotificationFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_articleitem_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = NotificationRecyclerViewAdapter(DummyContent.ITEMS)
            }
        }
        return view
    }
}
