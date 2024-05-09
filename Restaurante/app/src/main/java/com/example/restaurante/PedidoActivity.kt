package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() { // Declaração da classe PedidoActivity que estende AppCompatActivity

    private lateinit var binding: ActivityPedidoBinding // Declaração da variável de layout

    override fun onCreate(savedInstanceState: Bundle?) { // Método onCreate
        binding = ActivityPedidoBinding.inflate(layoutInflater) // Infla o layout da atividade
        super.onCreate(savedInstanceState) // Chama o método onCreate da superclasse
        setContentView(binding.root) // Define o layout da atividade como o layout inflado

        val i = intent // Obtém a intent que iniciou esta atividade

        // Obtém as quantidades de cada item do pedido da intent e converte para inteiros
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        // Cria uma string de resumo do pedido com base nas quantidades e preços
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n"

        // Define o texto do resumo do pedido na view textResumo do layout da atividade
        binding.textResumo.text = texto
    }
}


    }
}

    }
}
