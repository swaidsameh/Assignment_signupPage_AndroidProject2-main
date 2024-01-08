package com.example.assignment_androidproject2

//1. Create Two activity Main and Home.
//2. In Main you need to design a signup page and send the data by intent. (profile image, username, name, email, age, address will be taken from user)
//3. In Home you need show data by intent which is send by Main.

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val goMainBtn: Button = findViewById(R.id.goMainBtn)

        val userNameTv: TextView = findViewById(R.id.userNameTv)
        val nameTv: TextView = findViewById(R.id.nameTv)
        val emailTv: TextView = findViewById(R.id.emailTv)
        val ageTv: TextView = findViewById(R.id.ageTv)
        val addressTv: TextView = findViewById(R.id.addressTv)

        val userNameRt = intent.getStringExtra("userNameTv")
        val nameRt = intent.getStringExtra("nameTv")
        val emailRt = intent.getStringExtra("emailTv")
        val ageRt = intent.getStringExtra("ageTv")
        val addressRt = intent.getStringExtra("addressTv")

        userNameTv.text = userNameRt.toString()
        nameTv.text = nameRt.toString()
        emailTv.text = emailRt.toString()
        ageTv.text = ageRt.toString()
        addressTv.text = addressRt.toString()

        goMainBtn.setOnClickListener{
            Toast.makeText(this@HomeActivity, "On Button Click\nGoing back to Main", Toast.LENGTH_LONG).show()
            val intent = Intent(this@HomeActivity, MainActivity::class.java)

            startActivity(intent)
        }
    }
}