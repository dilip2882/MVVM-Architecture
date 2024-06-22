package com.dilip.listadapterexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ProgrammingAdapter :
    ListAdapter<ProgarmmingItem, ProgrammingAdapter.ProgrammingViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ProgrammingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgrammingViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class ProgrammingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        val initial = view.findViewById<TextView>(R.id.initial)

        fun bind(item: ProgarmmingItem) {
            name.text = item.name
            initial.text = item.initial
        }
    }

    class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<ProgarmmingItem>() {
        override fun areItemsTheSame(oldItem: ProgarmmingItem, newItem: ProgarmmingItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ProgarmmingItem,
            newItem: ProgarmmingItem
        ): Boolean {
            return oldItem == newItem
        }

    }
}