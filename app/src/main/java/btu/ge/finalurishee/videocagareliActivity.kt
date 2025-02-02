package btu.ge.finalurishee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityVideocagareliBinding

class videocagareliActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideocagareliBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideocagareliBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.kitxva.setOnClickListener {
            val intent = Intent(this, qaliActivity::class.java)
            startActivity(intent)
        }
        binding.kitxvari.setOnClickListener {
            val intent = Intent(this, ociActivity::class.java)
            startActivity(intent)
        }
    }
}
