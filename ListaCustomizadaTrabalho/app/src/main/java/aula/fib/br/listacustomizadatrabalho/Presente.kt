package aula.fib.br.listacustomizadatrabalho

import java.io.Serializable

data class Presente(var id: Long,
                   var nome: String,
                   val descricao: String? = null,
                   val img: Int = R.drawable.indisponivel ) : Serializable