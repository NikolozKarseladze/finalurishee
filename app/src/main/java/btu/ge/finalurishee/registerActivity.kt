package btu.ge.finalurishee

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class registerActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.Register.setOnClickListener {
            signupUser()
        }
    }

    private fun signupUser() {
        val email = binding.Signupmail.text.toString()
        val password = binding.Signuppassword.text.toString()

        if (email.isEmpty()) {
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.Signupmail.error = "Please enter a valid email"
            return
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show()
            binding.Signuppassword.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this, MainActivity::class.java))
                } else {
                    Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
