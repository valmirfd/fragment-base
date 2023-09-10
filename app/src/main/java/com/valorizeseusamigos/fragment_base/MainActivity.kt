package com.valorizeseusamigos.fragment_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.valorizeseusamigos.fragment_base.fragments.ChamadasFragment
import com.valorizeseusamigos.fragment_base.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

       /* val fragmentManager = supportFragmentManager.beginTransaction()

        //alterações em fragments
        fragmentManager.add(R.id.fragmentConteudo, ConversasFragment())

        fragmentManager.commit()*/

        btnConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentConteudo, ConversasFragment())
                .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentConteudo, ChamadasFragment())
                .commit()
        }




    }
}