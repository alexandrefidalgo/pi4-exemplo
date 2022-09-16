package br.senac.pi.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.pi.R
import br.senac.pi.databinding.ActivityTabBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Cria uma instancia do adapter de páginas
        val adapter = TabPageAdapter(this)

        //Associa o adaptador ao viewPager
        binding.viewPager.adapter = adapter

        //Trata os ícones ou texto das abas, para cada posição
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { aba, posicao ->
            when(posicao) {
                0 -> aba.icon = getDrawable(R.drawable.history)
                1 -> aba.icon = getDrawable(R.drawable.person)
                2 -> aba.icon = getDrawable(R.drawable.album)
                else -> aba.icon = getDrawable(R.drawable.settings)
            }
        }.attach()
    }
}