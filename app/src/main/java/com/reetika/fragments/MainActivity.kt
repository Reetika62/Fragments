package com.reetika.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

 public class MainActivity : AppCompatActivity() {



                 class MainActivity : AppCompatActivity() {

                     lateinit var tvCount: TextView
                     lateinit var binding: ActivityMainBinding

                     override fun onCreate(savedInstanceState: Bundle?) {
                         super.onCreate(savedInstanceState)
                         binding = ActivityMainBinding.inflate(layoutInflater)
                         setContentView(binding.root)
                         binding.btnAlert.setOnClickListener {
                             var alertDialog = AlertDialog.Builder(this)
                             alertDialog.setTitle("Select Color")
                             alertDialog.setMessage("Select a color that you want to set as fragment background")
                             alertDialog.setPositiveButton("Blue") { _, _ ->
                                 replaceFragment(FragmentA())
                             }
                             alertDialog.setNegativeButton("Red") { _, _ ->
                                 replaceFragment(FragmentB())
                             }
                             alertDialog.setNeutralButton("Yellow") { _, _ ->
                                 replaceFragment(FragmentC())
                             }
                             alertDialog.show()

                         }


                     }

                     private fun replaceFragment(fragment: Fragment) {
                         val fragmentManager = supportFragmentManager
                         val fragmentTransaction = fragmentManager.beginTransaction()
                         fragmentTransaction.replace(R.id.fragment_container, fragment)
                         fragmentTransaction.commit()

                     }

                 }








