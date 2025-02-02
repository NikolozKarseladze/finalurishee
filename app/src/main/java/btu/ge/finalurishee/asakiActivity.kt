package btu.ge.finalurishee

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityAsakiBinding

class asakiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAsakiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsakiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.asaki14.setOnClickListener {
            Toast.makeText(this, "ცხენის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki15.setOnClickListener {
            Toast.makeText(this, "ცხვრის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki16.setOnClickListener {
            Toast.makeText(this, "მაიმუნის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki17.setOnClickListener {
            Toast.makeText(this, "მამალის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki18.setOnClickListener {
            Toast.makeText(this, "ძაღლის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki19.setOnClickListener {
            Toast.makeText(this, "ღორის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki20.setOnClickListener {
            Toast.makeText(this, "ვირთხის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki21.setOnClickListener {
            Toast.makeText(this, "ხარის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki22.setOnClickListener {
            Toast.makeText(this, "ვეფხვის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki23.setOnClickListener {
            Toast.makeText(this, "კურდღლის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki24.setOnClickListener {
            Toast.makeText(this, "დრაკონის წელი", Toast.LENGTH_LONG).show()
        }
        binding.asaki25.setOnClickListener {
            Toast.makeText(this, "გველის წელი", Toast.LENGTH_LONG).show()
        }
    }
}
