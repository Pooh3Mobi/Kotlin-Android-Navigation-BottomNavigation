package mobi.pooh3.navigationinbottomnavigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav_view.setupWithNavController(Navigation.findNavController(this, R.id.my_nav_host_fragment))
        setupActionBarWithNavController(this, Navigation.findNavController(this, R.id.my_nav_host_fragment))

    }

//    override fun onSupportNavigateUp(): Boolean {
//        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
//    }
}
