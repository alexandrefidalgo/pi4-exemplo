package br.senac.pi.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.pi.R
import br.senac.pi.databinding.ActivityBottomNavigationBinding
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.RecentsFragment
import br.senac.pi.fragments.SettingsFragment

class BottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Trata o clique nos itens da bottom navigation
        binding.bottomNavigation.setOnItemSelectedListener {
            //Verifica qual opção do menu foi clicada, de acordo com o ID das opções no arquivo de menu
            when(it.itemId) {
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
                //Se clicou em outra opção
                R.id.recentes -> {
                    //Cria uma nova instância do fragmento de recentes
                    val frag = RecentsFragment()
                    //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                    //pelo fragmento de recentes
                    supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
                }
                R.id.config -> {
                    //Cria uma nova instância do fragmento de configurações
                    val frag = SettingsFragment()
                    //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                    //pelo fragmento de configurações
                    supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
                }
            }

            true
        }
    }

}