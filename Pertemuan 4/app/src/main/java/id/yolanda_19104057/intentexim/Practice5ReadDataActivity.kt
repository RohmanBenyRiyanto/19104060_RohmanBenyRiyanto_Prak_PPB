package id.yolanda_19104057.intentexim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.yolanda_19104057.intentexim.databinding.ActivityMainBinding
import id.yolanda_19104057.intentexim.databinding.ActivityPractice5ReadDataBinding

class Practice5ReadDataActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPractice5ReadDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_read_data)

        val prodi = intent.getStringArrayExtra(EXTRA_PRODI)
        binding.tvProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object{
        const val EXTRA_PRODI ="exxtra_prodi"
    }
}