package btu.ge.finalurishee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityArchevaniBinding

class archevaniActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArchevaniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArchevaniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.zodiaqoebi.setOnClickListener {
            val intent = Intent(this, zodiaqoActivity::class.java)
            startActivity(intent)
        }
        binding.wlebi.setOnClickListener {
            val intent = Intent(this, asakiActivity::class.java)
            startActivity(intent)
        }
        binding.videoebi.setOnClickListener {
            val intent = Intent(this, videocagareliActivity::class.java)
            startActivity(intent)
        }
    }
}
