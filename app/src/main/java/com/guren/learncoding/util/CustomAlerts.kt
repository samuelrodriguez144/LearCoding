package com.guren.learncoding.util

import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.guren.learncoding.base.BaseApplication

public class CustomAlerts {

    fun showToast(message:String){
        Toast.makeText(BaseApplication.applicationContext(), message, Toast.LENGTH_SHORT).show()
    }

    fun showSnackBar(view: View, message: String){
        val snack = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE)
        snack.show()
    }
}