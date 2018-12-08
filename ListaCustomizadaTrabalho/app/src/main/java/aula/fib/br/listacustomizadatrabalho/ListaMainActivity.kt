package aula.fib.br.listacustomizadatrabalho

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class ListaMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_main)

        val listaPresentes = ArrayList<Presente>()
        val p1 = Presente(1L, "Geladeira", "Equipe à sua cozinha com equipamentos que fará toda diferença em seu dia a dia. Além de ampla capacidade de armazenamento e melhor distribuição de alimentos e bebidas, o Refrigerador Brastemp BRM44HK conta com tecnologia de última geração e eficiência em toda a sua estrutura. Repleto de compartimentos desenvolvidos especialmente para cada tipo de perecível, o eletrodoméstico conta com sistema Frost Free e 288 litros de capacidade no refrigerador e 86 litros no freezer.", R.drawable.geladeira)
        val p2 = Presente(2L, "Fogão", "Que tal impressionar a família toda na hora de preparar aquele almoço ou jantar? E para começar, é importante ter um fogão de qualidade. Com este modelo da Atlas, que possui acendimento, 4 queimadores e um forno potente. Na hora de preparar as suas refeições, você vai sentir a diferença. Além dessas facilidades, ele possui um design exclusivo que vai deixar a sua cozinha ainda mais linda.", R.drawable.fogao)
        val p3 = Presente(3L, "Guarda roupa", "O Guarda Roupa Casal com Espelho Smart é ideal para deixar o seu ambiente ainda mais bonito! feito em mdp com portas de correr, o produto possui amplo espaço interno, acompanhado de 3 gavetas, cabideiro e calceiro além de um local exclusivo para calçados na parte inferior. É o Guarda Roupa ideal para seu quarto, que tanto você procurava!", R.drawable.guardaroupa)
        val p4 = Presente(4L, "Microondas", "Possui menu kids que prepara de maneira rápida as receitas prediletas da garotada como brigadeiro e pipoca, além de opções para descongelamento - descongelar rápido e descongelar pelo peso. Este micro-ondas permite programar o horário do preparo com antecedência com a função timer e conta com vários níveis de potência para escolher de acordo com o tipo de alimento. Ideal para sua cozinha!", R.drawable.microondas)
        val p5 = Presente(5L, "Sofá", "Nada melhor do que um lugar confortável para descansar depois de um dia cansativo, ou um lugar gostoso pra ver aquele filminho. Produzido em madeira, o Sofá Palazzo Retrátil 3 Lugares Siena Móveis é ideal para isso com espuma D23 no assento e fibras e flocos 50% em seu encosto é o sinônimo perfeito de bom gosto, conforto e elegância.", R.drawable.sofa)
        val p6 = Presente(5L, "Armário de cozinha", "A Cozinha Compacta Kit Manu Poquema é ideal para vocêProduzido com material de excelente qualidade, possui estrutura em MDPcom acabamento em pintura UV fosco, garantindo qualidade e durabilidade ao produto. Composta por 6 portas com dobradiças metálicas e 2 gavetas com corrediças metálicas,ideal para espaços pequenos.")

        listaPresentes.add(p1)
        listaPresentes.add(p2)
        listaPresentes.add(p3)
        listaPresentes.add(p4)
        listaPresentes.add(p5)
        listaPresentes.add(p6)

        val adapter = PresenteAdapter(applicationContext, listaPresentes)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)

        lista.setOnItemClickListener {parent, view, position, id ->
            val presente = listaPresentes.get(position)
            val intent = Intent(this, DetalhePresente::class.java)
            intent.putExtra("presente", presente)
            startActivity(intent)
        }

    }

}
