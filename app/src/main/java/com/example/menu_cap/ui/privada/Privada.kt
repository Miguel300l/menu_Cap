package com.example.menu_cap.ui.privada

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.FragmentTransaction
import com.example.menu_cap.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Privada.newInstance] factory method to
 * create an instance of this fragment.
 */
class Privada : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_privada, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment privada.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Privada().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

        class JornadaFragment : Fragment() {

            override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
                val view = inflater.inflate(R.layout.fragment_privada, container, false)
                val jornadaSpinner = view.findViewById<Spinner>(R.id.jornada_spinner)
                jornadaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                        val selectedJornada = adapterView.getItemAtPosition(i).toString()
                    }

                    override fun onNothingSelected(adapterView: AdapterView<*>?) {}
                }
                return view
            }
        }

        class CharlasFragment : Fragment() {

            override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
                val view = inflater.inflate(R.layout.fragment_privada, container, false)
                val charlasSpinner = view.findViewById<Spinner>(R.id.spinner_charlas)
                charlasSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                        val selectedCharla = adapterView.getItemAtPosition(i).toString()
                    }

                    override fun onNothingSelected(adapterView: AdapterView<*>?) {}
                }
                return view
            }
        }



    }
}