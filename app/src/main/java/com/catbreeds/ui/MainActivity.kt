package com.catbreeds.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.catbreeds.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter(get())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        lifecycleScope.launch (Dispatchers.Main) {
            val cats = presenter.getCats()
            binding.recycler.adapter = CatsAdapter(cats)
        }
    }
}