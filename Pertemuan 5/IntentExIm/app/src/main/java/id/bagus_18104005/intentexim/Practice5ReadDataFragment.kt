package id.bagus_18104005.intentexim

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.bagus_18104005.intentexim.databinding.FragmentPractice5ReadDataBinding

class Practice5ReadDataFragment : Fragment() {

    private lateinit var binding: FragmentPractice5ReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPractice5ReadDataBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null){
            val myName = arguments?.getString(EXTRA_NAMA)
            binding.tvMyData.text = "Nama Saya\t: $myName \nNIM Saya\t: $nim"
        }

        binding.btnKembaliBeranda.setOnClickListener {
            startActivity(Intent(activity, MainActivity::class.java))
        }

    }

    var nim: Int? = null
    companion object {
        var EXTRA_NAMA = ""
    }
}