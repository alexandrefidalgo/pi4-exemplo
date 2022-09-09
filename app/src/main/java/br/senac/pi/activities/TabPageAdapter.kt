package br.senac.pi.activities

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.RecentsFragment
import br.senac.pi.fragments.SettingsFragment


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
            else -> SettingsFragment()
        }
    }

}