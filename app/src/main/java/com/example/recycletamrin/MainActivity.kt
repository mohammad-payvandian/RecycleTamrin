package com.example.recycletamrin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycletamrin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.rtView.layoutManager = LinearLayoutManager(this)
        binding.rtView.adapter = Adapter(
            listOf(
                Items("Mohammad"),
                Items("Ali"),
                Items("Hasan"),
            )
        )
    }
}