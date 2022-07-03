package developer.abdusamid.bottomnavigationview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.abdusamid.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            myBottomNav.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_home -> tvInfo.text = "Home"
                    R.id.menu_favourite -> tvInfo.text = "Favourite"
                    R.id.menu_settings -> tvInfo.text = "Settings"
                }
                true
            }
        }
    }
}