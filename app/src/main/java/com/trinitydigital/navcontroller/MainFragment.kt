package com.trinitydigital.navcontroller

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnNext.setOnClickListener {
            if (isNotEmpty(login) && isNotEmpty(password)) {
                val data =
                    LoginData(login = login.text.toString(), password = password.text.toString())

                val directions =
                    MainFragmentDirections.actionMainFragmentToSecondFragment6()

                directions.myData = data

                findNavController().navigate(directions)
            } else {

            }


        }
    }


    private fun isNotEmpty(editText: EditText): Boolean {
        return editText.text.toString().isNotEmpty()
    }
}