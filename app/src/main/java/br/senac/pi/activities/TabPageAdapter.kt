package br.senac.pi.activities

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.senac.pi.fragments.*


//Adaptador chamado para montagem das abas
class TabPageAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    //Obtém a quantidade de abas
    override fun getItemCount(): Int {
        return 4
    }

    //Para cada aba, retorna um fragmento
    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> RecentsFragment()
            1 -> ArtistsFragment()
            2 -> AlbumsFragment()
            3 -> SettingsFragment()
            else -> ListaProdutosFragment()
        }
    }

}