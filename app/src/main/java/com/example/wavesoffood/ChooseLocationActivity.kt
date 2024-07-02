package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityChooseLocationBinding
import com.example.wavesoffood.databinding.ActivitySignBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val bindings : ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(bindings.root)
        val locationList = arrayOf("Bhubaneswar","Cuttack","Berhampur","Khallikote","Khordha","Balugaon")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = bindings.listOfLocation
        autoCompleteTextView.setAdapter(adapter)

//        bindings.logInText.setOnClickListener{
//            val intent = Intent(applicationContext,LoginActivity::class.java)
//            startActivity(intent)
//        }
    }
}