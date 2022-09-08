package br.senac.pi.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import br.senac.pi.R
import br.senac.pi.databinding.ActivityNvBinding
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.RecentsFragment

class NavigationViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityNvBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Ativa o menu do canto superior
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Ativa o botão do menu
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.abrir_menu, R.string.fechar_menu)

        //Faz com que o menu abra e feche de acordo com o estado do botão
        binding.drawerLayout.addDrawerListener(toggle)

        //Sincroniza o estado de abertura do botão com o menu
        toggle.syncState()

        //Configura um listener para tratar o clique nas opções do menu
        binding.nv.setNavigationItemSelectedListener {
            //Fecha todos os menus
            binding.drawerLayout.closeDrawers()

            //Trata as opções de menu
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
                else -> {
                    //Cria uma nova instância do fragmento de recentes
                    val frag = RecentsFragment()
                    //Faz o gestor de fragmentos trocar o fragmento atualmente em exibição
                    //pelo fragmento de recentes
                    supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
                }
            }

            true
        }
    }

    //Função chamada quando uma opção de menu é clicada
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Repassa a opçao selecionada para o listener acima
        toggle.onOptionsItemSelected(item)
        return super.onOptionsItemSelected(item)
    }
}