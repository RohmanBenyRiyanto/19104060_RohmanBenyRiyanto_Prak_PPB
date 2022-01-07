package com.rohmanbeny.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohmanbeny.modul5.databinding.ActivityPractice5ReadDataBinding

class Practice5ReadDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPractice5ReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPractice5ReadDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        binding.tvProdiSaya.text = "Prodi Saya Adalah $prodi"
    }



    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
}