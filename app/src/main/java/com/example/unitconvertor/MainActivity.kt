package com.example.unitconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.unitconvertor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayList_unit = arratListOf<String>("Length", "Weight", "Volume")
        val arrayAdapter_unit = ArrayAdapter(applicationContext, R.layout.textview_blue, arrayList_unit)
        binding.spUnit.adapter=arrayAdapter_unit
    }
}