package developer.abdusamid.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import developer.abdusamid.bottomnavigationview.databinding.ActivityBottomNavBinding

class BottomNav : AppCompatActivity() {
    private lateinit var binding: ActivityBottomNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            tvMain2.setOnClickListener {
                drawerLayout.openDrawer(GravityCompat.START)
            }
            navView.setNavigationItemSelectedListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                when (it.itemId) {
                    R.id.menu_home -> Toast.makeText(
                        this@BottomNav,
                        "HOME LAYOUT",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                true
            }
            navView.getHeaderView(0).findViewById<TextView>(R.id.tv_header).text = "SALOM"
        }
    }
}