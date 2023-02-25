package com.reza.tugasdicoding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CurrencyAdapter (private val context: Context,private val currency: List<Currency>,val listener: (Currency) -> Unit)
    : RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {
        class CurrencyViewHolder(view: View): RecyclerView.ViewHolder(view){

            val image = view.findViewById<ImageView>(R.id.img_item_photo)
            val nama = view.findViewById<TextView>(R.id.tv_item_name)
            val deskripsi = view.findViewById<TextView>(R.id.tv_item_description)
            val price = view.findViewById<TextView>(R.id.tv_price)
            val totalSupply = view.findViewById<TextView>(R.id.tv_total_supply)
            val marketCap = view.findViewById<TextView>(R.id.tv_market_cap)
            fun bindView(currency: Currency,listener: (Currency) -> Unit){
                    image.setImageResource(currency.img)
                    nama.text = currency.nama
                    deskripsi.text = currency.desc
                    price.text = currency.price.toString()


                itemView.setOnClickListener{listener(currency)}
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        return CurrencyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.currency_card, parent, false)
        )
    }

    override fun getItemCount(): Int = currency.size

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bindView(currency[position],listener)
    }

}