package aula.fib.br.layout

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ListView

class ListaCustomizada : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_customizada)

        val listaContatos = ArrayList<Contato>()
        val c1 = Contato(1L, "Collor", "color@br.com", "Alagoas")
        val c2 = Contato(2L, "Dilma", "dilma@br.com", "Porto Alegre")

        listaContatos.add(c1)
        listaContatos.add(c2)

        val adapter = ContatoAdapter(applicationContext, listaContatos)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)

//        lista.setOnItemClickListener {parent, view, position, id ->
//            val (id1, nome, email, endereco) = listaContatos.get(position)
//            Toast.makeText(this, "Clicked item : $nome", Toast.LENGTH_SHORT).show()
//        }

        lista.setOnItemClickListener {parent, view, position, id ->
            val contato = listaContatos.get(position)
            val intent = Intent(this, DetalheContato::class.java)
            intent.putExtra("contato", contato)
            startActivity(intent)
        }


    }
}
