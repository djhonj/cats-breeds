package com.catbreeds.ui

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.catbreeds.R
import com.catbreeds.domain.Cat
import com.squareup.picasso.Picasso

class CatsAdapter(private val cats: List<Cat>): RecyclerView.Adapter<CatsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cat_breed, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (this.getItemCount() > 0) {
            val contact = cats[position]
            holder.bind(contact)
        }
    }

    override fun getItemCount(): Int = cats.size

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        fun bind(cat: Cat) {
            view.findViewById<TextView>(R.id.tvName).text = cat.breedName
            view.findViewById<TextView>(R.id.tvOrigen).text =cat.origin
            view.findViewById<TextView>(R.id.tvIntelligence).text = cat.affectionLevel.toString()

            Picasso
                .get()
                .load(cat.imageUrl)
                .into(view.findViewById<ImageView>(R.id.ivImage))
        }
    }
}