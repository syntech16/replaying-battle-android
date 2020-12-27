package eus.avallende.replayingbattle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import eus.avallende.replayingbattle.databinding.FragmentBattleBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class BattleFragment : Fragment() {

    private var _binding: FragmentBattleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBattleBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBattle.setOnClickListener {
            findNavController().navigate(R.id.action_BattleFragment_to_Welcomeragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}