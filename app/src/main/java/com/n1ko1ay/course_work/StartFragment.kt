package com.n1ko1ay.course_work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class StartFragment : Fragment() {

    lateinit var showToastButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_start, container, false)

        showToastButton=view.findViewById(R.id.show_toast_button)

        showToastButton.setOnClickListener {
            Toast.makeText(context,"Hello",Toast.LENGTH_LONG).show()
        }

        return view
    }

}