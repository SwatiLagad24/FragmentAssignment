package com.example.fragment_assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragment_assignment.databinding.ProductsFragmentBinding
class ProductsFragment : Fragment() {

    var products = ArrayList<Product>()
    lateinit var binding : ProductsFragmentBinding
    var productsAdapter = ProductsAdapter(products)



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        addDummyProducts()

        binding = ProductsFragmentBinding.inflate(layoutInflater)

        binding.recyclerProducts.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerProducts.adapter = productsAdapter

        productsAdapter.onProductClickListener = MyOnProductClickListener()

        /*var showProduct = ShowProduct()

        var inputBundle = Bundle()
        if("txtProductTitle"=="Laptop") {
            inputBundle.putString("Details","This laptop has this features")
            inputBundle.putInt("usercode", 24)

            showProduct.arguments = inputBundle

            parentFragmentManager.beginTransaction()
                .add(R.id.mainContainer, showProduct, null)
                .addToBackStack(null)
                .commit()
        }*/

        return binding.root
    }

    inner class MyOnProductClickListener : ProductsAdapter.OnProductClickListener {
        override fun onProductClick(product: Product, position: Int) {

            Toast.makeText(context, product.title, Toast.LENGTH_LONG).show()
        }
    }

    fun addDummyProducts() {
        products.add(Product(101, "Laptop", R.drawable.laptop))
        products.add(Product(102, "Projector", R.drawable.projector))
        products.add(Product(103, "Air Conditioner", R.drawable.airconditioner))
        products.add(Product(104, "Refrigerator", R.drawable.refigerator))
        products.add(Product(105, "Cooler", R.drawable.cooler))
    }
}
