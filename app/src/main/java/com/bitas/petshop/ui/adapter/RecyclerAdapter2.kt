package com.bitas.petshop.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bitas.petshop.R

class RecyclerAdapter2: RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>() {

    private var titles2 = arrayOf("Macaco pelúcia", "Triangulo pelúcia", "Escova Plástica", "Bola com espinho")

    private val images2 = intArrayOf(R.drawable.ic_monkey, R.drawable.ic_triangle, R.drawable.ic_brush, R.drawable.ic_spike_ball)

    private var prices = arrayOf("R$32,00", "R$64,00", "R$34,12", "R$14,50")

    private val wishlist = intArrayOf(R.drawable.ic_wishlist, R.drawable.ic_wishlist, R.drawable.ic_wishlist, R.drawable.ic_wishlist)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter2.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout2, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter2.ViewHolder, position: Int) {
        holder.itemTitle2.text = titles2[position]
        holder.itemPrices.text = prices[position]
        holder.itemImage2.setImageResource(images2[position])
        holder.itemWishlist.setImageResource(wishlist[position])


    }

    override fun getItemCount(): Int {
        return titles2.size
        return prices.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage2: ImageView
        var itemTitle2: TextView
        var itemPrices: TextView
        var itemWishlist: ImageView

        init {
            itemImage2 = itemView.findViewById(R.id.item_image2)
            itemTitle2 = itemView.findViewById(R.id.item_title2)
            itemPrices = itemView.findViewById(R.id.item_price)
            itemWishlist = itemView.findViewById(R.id.item_wishlist)
        }
    }
}
