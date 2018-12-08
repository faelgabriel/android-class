package aula.fib.br.layout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ContatoAdapter(context: Context, lista: ArrayList<Contato>) : BaseAdapter() {

    private var listaContatos: ArrayList<Contato>
    private var inflator: LayoutInflater

    init {
        this.listaContatos = lista
        this.inflator = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return this.listaContatos.size
    }

    override fun getItem(position: Int): Any? {
        return this.listaContatos.get(position)
    }

    override fun getItemId(position: Int): Long {
        return this.listaContatos.get(position).id;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val contato = this.listaContatos.get(position)
        val view = this.inflator.inflate(R.layout.linha, parent, false)
        (view.findViewById<TextView>(R.id.nome)).text = contato.nome
        return view
    }
}
