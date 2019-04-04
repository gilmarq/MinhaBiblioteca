package br.com.fiap.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*


class CustomToast{

     fun  showToast(context: Context, mensage: String ){

         var inflter = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
         val  customToastroot =  inflter.inflate(R.layout.custom_toast,null)
         val  customToast =  Toast(context)

         customToast.view =  customToastroot
         customToastroot.textView1.text = mensage
         customToast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0,0)
         customToast.duration = Toast.LENGTH_LONG
         customToast.show()
     }
    
}