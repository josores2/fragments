package com.example.ejemplofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs

class SegundoFragment : Fragment() {

    //val args = arguments?.get("nombre")
val args = getArguments()?.getString("nombre")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i("LOGFRAGMENT: ",args.toString())
        return inflater.inflate(R.layout.fragment_segundo, container, false)
    }
}