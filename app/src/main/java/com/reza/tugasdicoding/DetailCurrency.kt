package com.reza.tugasdicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCurrency : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_currency)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val currency = intent.getParcelableExtra<Currency>(MainActivity.INTENT_PARCELABLE)

        val imgCurrency = findViewById<ImageView>(R.id.img_item_photo)
        val nama = findViewById<TextView>(R.id.tv_item_name)
        val desc = findViewById<TextView>(R.id.tv_item_description)
        val price = findViewById<TextView>(R.id.tv_price)
        val totalSup = findViewById<TextView>(R.id.tv_total_supply)
        val marketCap = findViewById<TextView>(R.id.tv_market_cap)

        imgCurrency.setImageResource(currency?.img!!)
        nama.text = currency.nama
        desc.text = currency.desc
        price.text = currency.price.toString()
        totalSup.text = currency.totalSupply.toString()
        marketCap.text = currency.marketCap.toString()


        val share_text_1_btn = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.btn_share)
        share_text_1_btn.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,"Hey Check out this Great app:")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
    }


}
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}