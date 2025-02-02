package btu.ge.finalurishee

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import btu.ge.finalurishee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize Firebase
        try {
            FirebaseApp.initializeApp(this)
            Log.d("MainActivity", "Firebase initialized successfully")
        } catch (e: Exception) {
            Log.e("MainActivity", "Firebase initialization failed", e)
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        register()
    }

    private fun init() {
        try {
            auth = FirebaseAuth.getInstance()

            binding.loginButton.setOnClickListener {
                if (binding.email.text.isNotEmpty() && binding.password.text.isNotEmpty()) {
                    login()
                } else {
                    Toast.makeText(this, "შეავსეთ ველები", Toast.LENGTH_LONG).show()
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Error during initialization", e)
        }
    }

    private fun login() {
        val email = binding.email.text.toString()
        val password = binding.password.text.toString()

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d("login", "signInWithEmail:success")
                    val intent = Intent(this, archevaniActivity::class.java)
                    intent.putExtra("mail", email)
                    intent.putExtra("password", password)
                    startActivity(intent)
                } else {
                    Log.w("login", "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    private fun register() {
        binding.registerButton.setOnClickListener {
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }
    }
}
