package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<LinearLayout>(R.id.btnAgendamento).setOnClickListener {
            startActivity(Intent(this, AgendamentoActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnRecompensas).setOnClickListener {
            startActivity(Intent(this, RecompensasActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnImpacto).setOnClickListener {
            startActivity(Intent(this, ImpactoAmbientalActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnLocalizarPonto).setOnClickListener {
            startActivity(Intent(this, LocalizarPontoActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnEscanearDispositivo).setOnClickListener {
            startActivity(Intent(this, EscanearDispositivoActivity::class.java))
        }

        findViewById<Button>(R.id.btnSair).setOnClickListener {
            finishAffinity() // ou: startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
