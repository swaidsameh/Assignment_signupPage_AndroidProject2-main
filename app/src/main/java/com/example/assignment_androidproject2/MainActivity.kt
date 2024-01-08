package com.example.assignment_androidproject2

//1. Create Two activity Main and Home.
//2. In Main you need to design a signup page and send the data by intent. (profile image, username, name, email, age, address will be taken from user)
//3. In Home you need show data by intent which is send by Main.

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userNameEt: EditText = findViewById(R.id.userNameEt)
        val nameEt: EditText = findViewById(R.id.nameEt)
        val emailEt: EditText = findViewById(R.id.emailEt)
        val ageEt: EditText = findViewById(R.id.ageEt)
        val addressEt: EditText = findViewById(R.id.addressEt)
        val goHomeBtn: Button = findViewById(R.id.goHomeBtn)

        goHomeBtn.setOnClickListener{
            Toast.makeText(this@MainActivity, "On Button Click\nGoing to Home", Toast.LENGTH_LONG).show()
            val intent = Intent(this@MainActivity, HomeActivity::class.java)

            val userNameTv = userNameEt.text.toString()
            val nameTv = nameEt.text.toString()
            val emailTv = emailEt.text.toString()
            val ageTv = ageEt.text.toString()
            val addressTv = addressEt.text.toString()

            intent.putExtra("userNameTv", userNameTv)
            intent.putExtra("nameTv", nameTv)
            intent.putExtra("emailTv", emailTv)
            intent.putExtra("ageTv", ageTv)
            intent.putExtra("addressTv", addressTv)

            startActivity(intent)
        }
    }
}