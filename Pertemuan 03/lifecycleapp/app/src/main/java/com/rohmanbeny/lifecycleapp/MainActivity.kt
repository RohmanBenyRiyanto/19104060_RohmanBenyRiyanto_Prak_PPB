package com.rohmanbeny.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPage.setOnClickListener {
            val pindah = Intent(this, RohmanBeny_19104060::class.java)
            startActivity(pindah)
        }
    }


    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show() }

    override fun onStart () {
        super.onStart()
        printState("Halaman satu On Start")
    }
    override fun onResume(){ super.onResume()
        printState("Halaman satu On Resume")
    }

    override fun onPause(){ super.onPause()
        printState("Halaman satu On Pause")
    }

    override fun onStop(){ super.onStop()
        printState("Halaman satu On Stop")
    }

    override fun onRestart(){ super.onRestart()
        printState("Halaman satu On Restart")
    }

    override fun onDestroy() { super.onDestroy()
        printState("Halaman satu On Destroy") }

}
