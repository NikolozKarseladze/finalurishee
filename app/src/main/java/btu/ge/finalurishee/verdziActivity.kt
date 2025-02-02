package btu.ge.finalurishee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityVerdziBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class verdziActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerdziBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerdziBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("user")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(UserModel::class.java)
                binding.textVerdzi.text = value?.verdzi ?: "No data"
                Log.d("onDataChange", "Value is: $value")
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w("onDataChange", "Failed to read value.", error.toException())
            }
        })
    }
}
