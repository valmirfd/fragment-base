package com.valorizeseusamigos.fragment_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.valorizeseusamigos.fragment_base.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager.beginTransaction()

        //alterações em fragments
        fragmentManager.add(R.id.fragmentConteudo, ConversasFragment())


        fragmentManager.commit()

    }
}