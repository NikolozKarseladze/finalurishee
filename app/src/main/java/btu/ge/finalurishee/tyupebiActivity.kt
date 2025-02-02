package btu.ge.finalurishee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityTyupebiBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class tyupebiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTyupebiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTyupebiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("user")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Fetch data and update the UI
                val value = dataSnapshot.getValue(UserModel::class.java)
                binding.textTyupebi.text = value?.tyupebii ?: "No data available"
                Log.d("onDataChange", "Value is: $value")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("onDataChange", "Failed to read value.", error.toException())
            }
        })
    }
}
