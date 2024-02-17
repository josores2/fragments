package com.example.ejemplofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class TercerFragment : Fragment() {

    //Recogemos los argumentos que vienen del fragment anterior
    val args: TercerFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Creamos esta variable para acceder fácilmente a las vistas del fragment
        //Se está creando una vista desde el archivo xml indicado.
        val root = inflater.inflate(R.layout.fragment_tercer, container, false)

        val btnNav = root.findViewById<Button>(R.id.btnFragmentClick3)
        val btnNav2 = root.findViewById<Button>(R.id.btnFragmentClick4)
        //Si es la primera vez que se crea la vista, metemos en LogCat el valor del argumento
        if(savedInstanceState == null){
            Log.i("LOGFRAGMENT :",args.provincia.toString())
        }
        btnNav.setOnClickListener {
            //llamamos a la acción , no al fragment
            //En este caso, al pulsar el botón, iremos al primer fragment
            val accion = TercerFragmentDirections.actionTercerFragmentToPrimerFragmento()

            findNavController().navigate(accion)
        }
        btnNav2.setOnClickListener {
            //llamamos a la acción , no al fragment
            //En este caso, al pulsar el botón, iremos al SEGUNDO fragment
            val accion = TercerFragmentDirections.actionTercerFragmentToSegundoFragment()

            findNavController().navigate(accion)
        }

        return root
    }
}