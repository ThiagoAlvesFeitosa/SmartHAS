package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConfirmarDispositivoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_dispositivo)

        val btnConfirmar = findViewById<Button>(R.id.btnConfirmarCodigo)
        btnConfirmar.setOnClickListener {
            val intent = Intent(this, DispositivoConfirmadoActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnVoltar = findViewById<Button>(R.id.btnVoltarEscanear)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, EscanearDispositivoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
