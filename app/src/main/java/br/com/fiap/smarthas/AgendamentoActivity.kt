package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AgendamentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendamento)

        val btnConfirmar = findViewById<Button>(R.id.btnConfirmarAgendamento)
        btnConfirmar.setOnClickListener {
            startActivity(Intent(this, ColetaConfirmadaActivity::class.java))
            finish()
        }
    }
}
