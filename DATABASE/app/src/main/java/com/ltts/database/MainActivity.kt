package com.ltts.database



import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   var recyclerView: RecyclerView? = null

        getText().setOnClickListener {

            var sign = Signin()
            var myrv: RecyclerView = findViewById<RecyclerView>(R.id.editTextTextPassword)
            myrv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        }

    }
    companion object {
        private const val ADD_EDIT_REQUEST = 1
    }

}