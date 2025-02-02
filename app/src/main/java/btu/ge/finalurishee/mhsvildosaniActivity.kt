package btu.ge.finalurishee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityMhsvildosaniBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class mhsvildosaniActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMhsvildosaniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMhsvildosaniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("user")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Retrieve and display data from the database
                val value = dataSnapshot.getValue(UserModel::class.java)
                if (value != null) {
                    binding.textmshvildosani.text = value.mshvildosanii
                    Log.d("onDataChange", "Value is: $value")
                } else {
                    Log.w("onDataChange", "No data found")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Log an error if data retrieval fails
                Log.w("onDataChange", "Failed to read value.", error.toException())
            }
        })
    }
}
