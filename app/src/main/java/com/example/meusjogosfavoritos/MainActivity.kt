package com.example.meusjogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meusjogosfavoritos.Model.Jogo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.jogos_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvJogos.adapter = JogosAdapter(carregaJogos(),this){
            Toast.makeText(this,it.nome,Toast.LENGTH_LONG).show()
        }

        rvJogos.layoutManager = LinearLayoutManager(this)

    }


    private fun carregaJogos() : List<Jogo>{
        return listOf(
            godofWar(),
            godofWar(),
            godofWar()
        )
    }

    private fun godofWar(): Jogo{
        return Jogo(
            R.drawable.godofwar,
            "God of War",
            "2020",
            "Jogo top"
        )
    }
}
