package com.example.ejemplofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

class TercerFragment : Fragment() {

    //Recogemos los argumentos que vienen del fragment anterior
    val args: TercerFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Creamos esta variable para acceder fácilmente a las vistas del fragment
        val root = inflater.inflate(R.layout.fragment_tercer, container, false)

        //Si es la primera vez que se crea la vista, metemos en LogCat el valor del argumento
        if(savedInstanceState == null){
            Log.i("LOGFRAGMENT :",args.provincia.toString())
        }
        return root
    }
}