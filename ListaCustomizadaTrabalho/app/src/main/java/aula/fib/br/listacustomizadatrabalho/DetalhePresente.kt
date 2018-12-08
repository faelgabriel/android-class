package aula.fib.br.listacustomizadatrabalho

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetalhePresente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_presente)

        val intent = intent
        if (intent != null) {
            val presente = intent.getSerializableExtra("presente") as Presente

            findViewById<TextView>(R.id.nome).text = presente.nome
            findViewById<ImageView>(R.id.img).setImageResource(presente.img)
            findViewById<TextView>(R.id.descricao).text = presente.descricao
        }
    }

}
