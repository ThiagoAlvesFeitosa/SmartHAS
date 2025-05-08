package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EscanearDispositivoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escanear_dispositivo)

        val btnConfirmar = findViewById<Button>(R.id.btnConfirmarDispositivo)
        btnConfirmar.setOnClickListener {
            val intent = Intent(this, ConfirmarDispositivoActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnVoltar = findViewById<Button>(R.id.btnVoltarInicioDispositivo)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
