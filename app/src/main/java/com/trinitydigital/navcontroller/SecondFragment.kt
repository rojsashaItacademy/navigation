package com.trinitydigital.navcontroller

import android.os.Bundle
import android.view.View
import android.widget.Toast

class SecondFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_second

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arguments = SecondFragmentArgs.fromBundle(requireArguments())

        Toast.makeText(context, arguments.myData?.login, Toast.LENGTH_SHORT).show()






    }
}