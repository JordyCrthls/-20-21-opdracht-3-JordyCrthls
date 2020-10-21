package be.vives.ti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import be.vives.ti.databinding.ActivityMainBinding
import be.vives.ti.databinding.FragmentMainBinding
import be.vives.ti.databinding.FragmentUserDetailBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.fragment_main)

        binding.navToUser.setOnClickListener{
            val i = Intent(this, UserActivity::class.java)
            startActivity(i)
        }
    }
}
