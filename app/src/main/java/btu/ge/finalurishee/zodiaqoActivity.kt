package btu.ge.finalurishee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityZodiaqoBinding

class zodiaqoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityZodiaqoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZodiaqoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.Merwyuli.setOnClickListener {
            val intent = Intent(this, merwyuliActivity::class.java)
            startActivity(intent)
        }
        binding.Kirchxibi.setOnClickListener {
            val intent = Intent(this, kirchxibiActivity::class.java)
            startActivity(intent)
        }
        binding.Kuro.setOnClickListener {
            val intent = Intent(this, kuroActivity::class.java)
            startActivity(intent)
        }
        binding.Lomi.setOnClickListener {
            val intent = Intent(this, lomiActivity::class.java)
            startActivity(intent)
        }
        binding.Mshvildosani.setOnClickListener {
            val intent = Intent(this, mhsvildosaniActivity::class.java)
            startActivity(intent)
        }
        binding.Morieli.setOnClickListener {
            val intent = Intent(this, morieliActivity::class.java)
            startActivity(intent)
        }
        binding.Qalwuli.setOnClickListener {
            val intent = Intent(this, qalwuliActivity::class.java)
            startActivity(intent)
        }
        binding.Saswori.setOnClickListener {
            val intent = Intent(this, sasworiActivity::class.java)
            startActivity(intent)
        }
        binding.Tevzebi.setOnClickListener {
            val intent = Intent(this, tevzebiActivity::class.java)
            startActivity(intent)
        }
        binding.Txisrqa.setOnClickListener {
            val intent = Intent(this, txaActivity::class.java)
            startActivity(intent)
        }
        binding.Tyupebi.setOnClickListener {
            val intent = Intent(this, tyupebiActivity::class.java)
            startActivity(intent)
        }
        binding.Verdzi.setOnClickListener {
            val intent = Intent(this, verdziActivity::class.java)
            startActivity(intent)
        }
    }
}
