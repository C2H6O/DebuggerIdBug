package com.doubov.fragmentidbug

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentB : Fragment(R.layout.fragment_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.wtfTextView).text = "Fragment B"
    }
}