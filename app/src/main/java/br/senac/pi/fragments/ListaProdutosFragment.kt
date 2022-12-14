package br.senac.pi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.pi.R
import br.senac.pi.databinding.ActivityPrincipalBinding
import br.senac.pi.databinding.FragmentListaProdutosBinding

class ListaProdutosFragment : Fragment() {

    lateinit var binding: FragmentListaProdutosBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentListaProdutosBinding.inflate(inflater)

        return binding.root
    }
}

