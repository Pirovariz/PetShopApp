package com.bitas.petshop.ui.items

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bitas.petshop.databinding.FragmentItemsBinding
import com.bitas.petshop.ui.adapter.RecyclerAdapter

class ItemsFragment : Fragment() {

    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private var adapter2: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    private var _binding: FragmentItemsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        adapter = RecyclerAdapter()
        binding.recyclerView.adapter = adapter

        adapter2 = RecyclerAdapter()
        binding.recyclerView2.adapter = adapter2

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}