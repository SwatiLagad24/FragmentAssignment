package com.example.fragment_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment_assignment.databinding.ProductViewBinding

class ProductsAdapter(
    var products: ArrayList<Product>
) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    interface OnProductClickListener {
        fun onProductClick(product : Product, position: Int)
    }

    var onProductClickListener : OnProductClickListener? = null

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtProductId = itemView.findViewById<TextView>(R.id.txtProductId)
        var txtProductTitle = itemView.findViewById<TextView>(R.id.txtProductTitle)
        var imgProduct = itemView.findViewById<ImageView>(R.id.imgProduct)

        init {
            itemView.setOnClickListener {
                onProductClickListener?.onProductClick(products[adapterPosition], adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int = products.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var binding = ProductViewBinding.inflate(LayoutInflater.from(parent.context))
        return ProductViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.txtProductId.text = "${products[position].id}"
        holder.txtProductTitle.text = "${products[position].title}"
        holder.imgProduct.setImageResource(products[position].imageId)
    }
}