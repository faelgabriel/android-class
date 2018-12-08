package aula.fib.br.layout

import java.io.Serializable

data class Contato(var id: Long,
                   var nome: String,
                   val email: String? = null,
                   val endereco: String? = null ) : Serializable