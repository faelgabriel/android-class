package aula.fib.br.listacustomizadatrabalho

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PresenteAdapter(context: Context, lista: ArrayList<Presente>) : BaseAdapter() {

    private var listaPresentes: ArrayList<Presente>
    private var inflator: LayoutInflater

    init {
        this.listaPresentes = lista
        this.inflator = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return this.listaPresentes.size
    }

    override fun getItem(position: Int): Any? {
        return this.listaPresentes.get(position)
    }

    override fun getItemId(position: Int): Long {
        return this.listaPresentes.get(position).id;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val presente = this.listaPresentes.get(position)
        val view = this.inflator.inflate(R.layout.linha, parent, false)
        (view.findViewById<TextView>(R.id.nome)).text = presente.nome
        (view.findViewById<ImageView>(R.id.img)).setImageResource(presente.img)
        return view
    }
}
