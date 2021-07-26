package com.doubov.fragmentidbug

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentA : Fragment(R.layout.fragment_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("LX+++", "onViewCreated $view")
        val text = view.findViewById<TextView>(R.id.wtfTextView)
        Log.d("LX+++", "wtf... textView?!?!? $text id:${text.id} res_id: ${R.id.wtfTextView}")
        text.text = "Fragment A"
    }
}