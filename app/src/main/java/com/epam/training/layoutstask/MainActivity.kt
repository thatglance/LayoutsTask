package com.epam.training.layoutstask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatButton

/**
 * Main activity of application.
 * [MainActivity] contains 2 buttons to show [Fragment1] or [Fragment2].
 *
 * @author Alexandra Makovskaya
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                Fragment.instantiate(this, Fragment1::class.java.canonicalName)).commit()
        }

        val btnFragment1 = findViewById<AppCompatButton>(R.id.buttonFragment1)
        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, Fragment1()).commit()
        }

        val btnFragment2 = findViewById<AppCompatButton>(R.id.buttonFragment2)
        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, Fragment2()).commit()
        }
    }

}
