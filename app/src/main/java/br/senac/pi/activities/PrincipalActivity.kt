package br.senac.pi.activities

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.pi.R
import br.senac.pi.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {

    lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPrincipalBinding.inflate(layoutInflater)

        binding.buttonPesquisar.setOnClickListener{
            val intent = Intent(this, SecundariaActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}