package com.yehia.recordview

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yehia.recordview.databinding.ItemXBinding

public class ItemsAudAdapter(
    private val activity: Activity,
) : RecyclerView.Adapter<ItemsAudAdapter.ViewHolder>() {

    val list: MutableList<String> = ArrayList()

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemXBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.recordPlays.setAudioTarget(
            list[position], activity
        )
    }

    class ViewHolder(val binding: ItemXBinding) : RecyclerView.ViewHolder(binding.root)
}