package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //Cria-se um objeto binding que infla layouts XML do arquivo
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Inicializa a atividade e prepara o estado da interface do usuário se houver dados salvos.
        super.onCreate(savedInstanceState)
        //Define o layout e permite a interação entre elementos da interface do usuário.
        setContentView(binding.root)
        //Cria a constante username que é baseada em intent
        val username = intent.extras?.getString("username")
        //Cria uma condição em binding para o nome de usuário
        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
        }
        //
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }
        //Criação da constante intent e leitura a partir do binding dos nomes inseridos
        binding.buttonPedir.setOnClickListener{
            val i = Intent(this, SplashActivity:: class.java)
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.text.toString())
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.text.toString())
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.text.toString())
            startActivity(i)
            finish()
        }
        //Este código define um ouvinte de clique para um CheckBox.
        binding.checkPizza.setOnClickListener {
            //
            if(binding.checkPizza.isChecked()){
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            }else{
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        binding.checkSalada.setOnClickListener {
            if(binding.checkSalada.isChecked()){
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        binding.checkHamburger.setOnClickListener {
            if(binding.checkHamburger.isChecked()){
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }

    }
}