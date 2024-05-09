package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Chamada ao método onCreate da superclasse AppCompatActivity
        super.onCreate(savedInstanceState)
        
        // Define o layout da activity como o layout especificado em activity_splash.xml
        setContentView(R.layout.activity_splash)

        // Cria um objeto Handler associado ao Looper principal para lidar com a execução assíncrona
        Handler(Looper.getMainLooper()).postDelayed({
            // Obtém a intent que iniciou esta activity
            val i = intent
            
            // Cria uma nova intent que direciona para a PedidoActivity
            val j = Intent(this, PedidoActivity::class.java)
            
            // Transfere quaisquer extras da intent atual para a nova intent
            j.putExtras(i)
            
            // Inicia a activity PedidoActivity
            startActivity(j)
        }, 2000) // Posta o atraso de 2000 milissegundos (2 segundos) antes de executar o código dentro do bloco
    }
}

    }
}





    }
}
