package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecompensaColetadaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recompensa_coletada)

        val btnVoltar = findViewById<Button>(R.id.btnVoltarRecompensas)
        btnVoltar.setOnClickListener {
            startActivity(Intent(this, RecompensasActivity::class.java))
            finish()
        }
    }
}