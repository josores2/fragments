package com.example.ejemplofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
//import com.example.ejemplofragment.PrimerFragmento.Companion.ADDRESS_BUNDLE
//import com.example.ejemplofragment.PrimerFragmento.Companion.NAME_BUNDLE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        if(savedInstanceState == null) {
            val bundle = bundleOf(
                NAME_BUNDLE to "PruebaClase Name",
                ADDRESS_BUNDLE to "PruebaClase Address"
            )
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<PrimerFragmento>(R.id.fragmentContainer, args = bundle)
            }
        }*/
    }
}