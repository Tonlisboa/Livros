package br.edu.sdm.pa1.livros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import br.edu.sdm.pa1.livros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy {
    ActivityMainBinding.inflate(layoutInflater)

    }

    private val LivroList: Mutabble<Livro> = mutableListOf()

    private  var LivrosAdapter: ArrayAdapter<String> by lazy {
        val LivrosStringList = mutableListOf<String>()
        livrosList.forech{livro -> livroStringList.add(livro.toString())}
        ArrayAdapter(context: this, android.R.Layout.simple_list_item_1, livrosStringList
    }

    override fun onCreate(savedInstanceState: Bundle) {
        super.oncreate(savedInstanceState)
        setContentView(activityMainBinding.root)

    }

    private fun inicializarLivrosList (){
        for(indice in 1..10){
            Livro(
                titulo "Titulo $Indice",
                isbn "ISBN $indice",
                primeiroAutor "Primeiro autor $indice",

            )
        }
    }
}