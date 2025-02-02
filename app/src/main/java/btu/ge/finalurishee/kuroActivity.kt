package btu.ge.finalurishee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityKuroBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class kuroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKuroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKuroBinding.inflate(layoutInflater)
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
                    binding.textKuro.text = value.kuroo
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
