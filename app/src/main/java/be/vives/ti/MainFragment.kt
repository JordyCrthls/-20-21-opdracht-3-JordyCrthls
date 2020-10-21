package be.vives.ti

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import be.vives.ti.databinding.ActivityMainBinding
import be.vives.ti.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main,container,false)

        binding.navToUser.setOnClickListener{
            val i = Intent(activity, UserActivity::class.java)
            startActivity(i)

            requireView().findNavController().navigate(R.id.action_mainFragment_to_userActivity)
        }
        return binding.root
    }
}