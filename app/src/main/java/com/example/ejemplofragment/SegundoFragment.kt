package com.example.ejemplofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.airbnb.lottie.LottieAnimationView

class SegundoFragment : Fragment() {
    //Recogemos los argumentos que vienen del fragment anterior
    val args: SegundoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Creamos esta variable para acceder fácilmente a las vistas del fragment
        val root = inflater.inflate(R.layout.fragment_segundo, container, false)

        val btnNav = root.findViewById<Button>(R.id.btnFragmentClick2)
        val btnAni = root.findViewById<LottieAnimationView>(R.id.animationView2)

        //Si es la primera vez que se crea la vista, metemos en LogCat el valor del argumento
        if(savedInstanceState == null){
            Log.i("LOGFRAGMENT :",args.name.toString())
        }

        btnNav.setOnClickListener {
            //llamamos a la acción , no al fragment
            //En este botón, le pasamos argumentos al segundo fragment con safeArgs, por lo que la llamada es distinta que el otro botón
            val accion = SegundoFragmentDirections.actionSegundoFragmentToTercerFragment("Valor Argumento2")

            findNavController().navigate(accion)
        }

        btnAni.setOnClickListener{
            val accion2 = SegundoFragmentDirections.actionSegundoFragmentToTercerFragment(null)
            findNavController().navigate(accion2)
            //findNavController().navigate(R.id.action_segundoFragment_to_tercerFragment)
        }
        return root
    }
}