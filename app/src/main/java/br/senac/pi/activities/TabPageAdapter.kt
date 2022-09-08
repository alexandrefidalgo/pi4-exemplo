package br.senac.pi.activities

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.RecentsFragment


//Adaptador chamado para montagem das abas
class TabPageAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    //Obtém a quantidade de abas
    override fun getItemCount(): Int {
        return 3
    }

    //Para cada aba, retorna um fragmento
    override fun createFragment(position: Int): Fragment {
        return when(position) {
            1 -> ArtistsFragment()
            2 -> AlbumsFragment()
            else -> RecentsFragment()
        }
    }

}