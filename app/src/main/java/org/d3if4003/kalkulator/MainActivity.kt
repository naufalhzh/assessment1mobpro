package org.d3if4003.kalkulator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.d3if4003.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var nomerPertama: Int? = null
    var nomerKedua: Int? = null
    var hasil: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun tambah(view: View) {
        nomerPertama = binding.editTextNumber1.text.toString().toIntOrNull()
        nomerKedua = binding.editTextNumber2.text.toString().toIntOrNull()
        if (nomerPertama == null || nomerKedua == null) {
            println("Invalid inputs!")
        } else {
            val result = nomerPertama!! + nomerKedua!!
            hasil = "Hasil : ${result}"
            binding.hasil.text = hasil
        }
    }

    fun kurang(view: View) {
        nomerPertama = binding.editTextNumber1.text.toString().toIntOrNull()
        nomerKedua = binding.editTextNumber2.text.toString().toIntOrNull()
        if (nomerPertama == null || nomerKedua == null) {
            println("Invalid inputs!")
        } else {
            val result = nomerPertama!! - nomerKedua!!
            hasil = "Hasil : ${result}"
            binding.hasil.text = hasil
        }
    }

    fun kali(view: View) {
        nomerPertama = binding.editTextNumber1.text.toString().toIntOrNull()
        nomerKedua = binding.editTextNumber2.text.toString().toIntOrNull()
        if (nomerPertama == null || nomerKedua == null) {
            println("Invalid inputs!")
        } else {
            val result = nomerPertama!! * nomerKedua!!
            hasil = "Hasil : ${result}"
            binding.hasil.text = hasil
        }
    }

    fun bagi(view: View) {
        nomerPertama = binding.editTextNumber1.text.toString().toIntOrNull()
        nomerKedua = binding.editTextNumber2.text.toString().toIntOrNull()
        if (nomerPertama == null || nomerKedua == null) {
            println("Invalid inputs!")
        } else {
            val result = nomerPertama!! / nomerKedua!!
            hasil = "Hasil : ${result}"
            binding.hasil.text = hasil
        }
    }
}