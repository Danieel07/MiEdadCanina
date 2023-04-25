 package com.example.miedadcanina

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miedadcanina.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activity.root)


        activity.BtnCalcular.setOnClickListener {
            val age = activity.TxtEdad.text.toString()
           if(age.isNotEmpty()){
               val age2 = age.toInt()
               val result = age2 * 7
               activity.LblResultado.text = getString(R.string.response, result)
           }
           else{
               activity.LblResultado.text = getString(R.string.Error)
           }
        }
    }
}