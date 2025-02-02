package btu.ge.finalurishee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import btu.ge.finalurishee.databinding.ActivityQalwuliBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class qalwuliActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQalwuliBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQalwuliBinding.inflate(layoutInflater)
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
                if (value != null) {
                    binding.textQalwuli.text = value.qalwulii
                    Log.d("onDataChange", "Value is: $value")
                } else {
                    Log.w("onDataChange", "No data found")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w("onDataChange", "Failed to read value.", error.toException())
            }
        })
    }
}
