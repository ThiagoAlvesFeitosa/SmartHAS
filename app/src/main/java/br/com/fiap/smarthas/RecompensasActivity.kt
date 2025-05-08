package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecompensasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recompensas)

        val btnVoltar = findViewById<Button>(R.id.btnVoltarInicio)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Ações de "Receber"
        val btnReceber1 = findViewById<Button>(R.id.btnReceber1)
        val btnReceber2 = findViewById<Button>(R.id.btnReceber2)
        val btnReceber3 = findViewById<Button>(R.id.btnReceber3)

        val abrirColetada = Intent(this, RecompensaColetadaActivity::class.java)

        btnReceber1.setOnClickListener { startActivity(abrirColetada) }
        btnReceber2.setOnClickListener { startActivity(abrirColetada) }
        btnReceber3.setOnClickListener { startActivity(abrirColetada) }
    }
}
