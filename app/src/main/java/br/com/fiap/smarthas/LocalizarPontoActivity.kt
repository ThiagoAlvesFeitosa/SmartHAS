package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LocalizarPontoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localizar_ponto)

        val btnVoltar = findViewById<Button>(R.id.btnVoltarMenuPontos)
        btnVoltar.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // Aqui você pode implementar lógica para confirmar endereço e ir para próxima tela
        val btnConfirmarEndereco = findViewById<Button>(R.id.btnConfirmarEndereco1)
        btnConfirmarEndereco.setOnClickListener {
            startActivity(Intent(this, ConfirmarPontoActivity::class.java))
            finish()
        }
    }
}
