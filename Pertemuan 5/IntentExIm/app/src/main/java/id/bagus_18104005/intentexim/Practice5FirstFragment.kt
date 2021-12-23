package id.bagus_18104005.intentexim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import id.bagus_18104005.intentexim.databinding.FragmentPractice5FirstBinding

class Practice5FirstFragment : Fragment() {

    private lateinit var binding : FragmentPractice5FirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPractice5FirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            btnToSecondFragment.setOnClickListener {
                val nama = inputNama.text.toString()
                if (nama.isEmpty()){
                    inputNama.error = "Nama Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val nim = inputNim.text.toString()
                if (nim.isEmpty()){
                    inputNim.error = "Nim Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val mReadDataFragment = Practice5ReadDataFragment()
                val mBundle = Bundle()
                mBundle.putString(Practice5ReadDataFragment.EXTRA_NAMA, nama)
                mReadDataFragment.arguments = mBundle
                mReadDataFragment.nim = nim.toInt()

                val mFragmentManager = fragmentManager as FragmentManager
                mFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, mReadDataFragment, Practice5ReadDataFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    companion object {

    }
}