package br.senac.pi.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.senac.pi.R
import br.senac.pi.databinding.ActivityToolbarMenuBinding
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.RecentsFragment
import br.senac.pi.fragments.SettingsFragment

class ToolbarMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityToolbarMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //Função chamada para criar o menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //Função chamada quando uma opção de menu é clicada
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Trata as opções de menu
        when(item.itemId) {
            //Se licou no menu com ID "artistas"
            R.id.artistas -> {
                //Cria uma nova instância do fragmento de artistas
                val frag = ArtistsFragment()
                //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                //pelo fragmento de artistas
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            //Se licou no menu com ID "albuns"
            R.id.albuns -> {
                //Cria uma nova instância do fragmento de albuns
                val frag = AlbumsFragment()
                //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                //pelo fragmento de albuns
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            //Se licou no menu com ID "recentes"
            R.id.recentes -> {
                //Cria uma nova instância do fragmento de recentes
                val frag = RecentsFragment()
                //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                //pelo fragmento de recentes
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            //Se licou no menu com ID "recentes"
            R.id.config -> {
                //Cria uma nova instância do fragmento de configuracoes
                val frag = SettingsFragment()
                //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                //pelo fragmento de recentes
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}