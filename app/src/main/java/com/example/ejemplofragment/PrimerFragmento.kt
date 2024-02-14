package com.example.ejemplofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PrimerFragmento : Fragment() {
    /*
    private var name: String? = null
    private var address: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME_BUNDLE)
            address = it.getString(ADDRESS_BUNDLE)
            Log.i("PEPITO: ",name.orEmpty())
        }
    }*/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_primer_fragmento, container, false)
        val btnNav = root.findViewById<Button>(R.id.btnFragmentClick)

        btnNav.setOnClickListener {
            //llamamos a la acción , no al fragment
            findNavController().navigate(R.id.action_primerFragmento_to_segundoFragment)
        }
        return root

        /*
    companion object {

        const val NAME_BUNDLE = "name_bundle"
        const val ADDRESS_BUNDLE = "email_bundle"

        @JvmStatic
        fun newInstance(name: String, address: String) =
            PrimerFragmento()
                .apply {
                arguments = Bundle().apply {
                    putString(NAME_BUNDLE, name)
                    putString(ADDRESS_BUNDLE, address)
                }
            }
    }*/
    }
}