package be.vives.ti

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import be.vives.ti.databinding.ActivityUserBinding
import be.vives.ti.databinding.FragmentMainBinding
import be.vives.ti.databinding.FragmentUserDetailBinding

class UserDetailFragment : Fragment() {

    private val user = User(1, "Jordy", "Corthals", "Azerty", true, "Actief")
    private lateinit var binding: ActivityUserBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentUserDetailBinding>(inflater, R.layout.fragment_user_detail,container,false)
        binding.myUser = user

        binding.actief.setOnClickListener {
            if (binding.actief.isChecked)
            {
                user.activeText = "Actief"
                user.isActive = true
            }else{
                user.activeText = "Niet actief"
                user.isActive = false
            }
            binding.apply {
                invalidateAll()
            }
        }
        return binding.root
    }
}