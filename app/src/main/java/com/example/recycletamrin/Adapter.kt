package com.example.recycletamrin

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recycletamrin.databinding.RecItemBinding

class Adapter(val valueList : List<Items>): RecyclerView.Adapter<Adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = RecItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val currentItem = valueList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = valueList.size


    class ViewHolder(private val binding: RecItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Items) {
            binding.items = item
            binding.executePendingBindings()
        }
    }

}