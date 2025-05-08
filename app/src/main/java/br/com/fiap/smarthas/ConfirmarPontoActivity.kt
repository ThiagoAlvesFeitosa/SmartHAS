package br.com.fiap.smarthas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConfirmarPontoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_ponto)

        val btnConfirmar = findViewById<Button>(R.id.btnConfirmarLocal)
        btnConfirmar.setOnClickListener {
            val intent = Intent(this, PontoLocalizadoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
