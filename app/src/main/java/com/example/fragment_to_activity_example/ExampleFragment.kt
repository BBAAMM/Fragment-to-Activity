package com.example.fragment_to_activity_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class ExampleFragment(_callBack:CallBack) : DialogFragment() {
    val callBack:CallBack

    init {
        callBack=_callBack
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val exampleInflater = inflater.inflate(R.layout.fragment_example, container, false)
        exampleInflater.findViewById<Button>(R.id.btn_example).setOnClickListener {
            callBack.callBackExample()
            dismiss()
        }
        return exampleInflater
    }
}