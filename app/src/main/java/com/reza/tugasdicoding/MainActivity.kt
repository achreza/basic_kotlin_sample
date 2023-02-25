package com.reza.tugasdicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val currencyList = listOf<Currency>(
            Currency(
                R.drawable.btc,
             "Bitcoin",
            "Bitcoin uses peer-to-peer technology to operate with no central authority or banks; managing transactions and the issuing of bitcoins is carried out collectively by the network.Bitcoin is open-source; its design is public, nobody owns or controls Bitcoin and everyone can take part. Through many of its unique properties, Bitcoin allows exciting uses that could not be covered by any previous payment system.",
                23576.675000000003,
                19301143.0,
                445247452238.3499
            ),
            Currency(
                R.drawable.eth,
                "Ethereum",
                "Ethereum is a platform powered by blockchain technology that is best known for its native cryptocurrency, called Ether, or ETH, or simply Ethereum. The distributed nature of blockchain technology is what makes the Ethereum platform secure, and that security enables ETH to accrue value.The Ethereum platform supports Ether in addition to a network of decentralized apps, otherwise known as dApps.",
                1619.261304197636,
                122373866.2178,
                195398172129.40076
            ),
            Currency(
                R.drawable.bnb,
                "BNB",
                "BNB is the cryptocurrency coin that powers the Binance ecosystem. As one of the world's most popular utility tokens, not only can you buy or sell BNB like any other cryptocurrency, but BNB comes with a wide range of applications and benefits.",
                305.42044524755795,
                157219628.63,
                47275828049.722404
            ),
            Currency(
                R.drawable.bnc,
                "Binance",
                "Binance USD (BUSD) is a new USD-denominated stablecoin approved by the New York State Department of Financial Services (NYDFS) that will be launched in partnership with Paxos and Binance.These are digitised US Dollars and are always purchased and redeemed at 1 BUSD for 1 US dollar.",
                0.9995000000000003,
                157219628.63,
                47275828049.722404
            ),
            Currency(
                R.drawable.doge,
                "DogeCoin",
                "Dogecoin is a peer-to-peer, open-source cryptocurrency. It is considered an altcoin and an almost sarcastic meme coin. Launched in December 2013, Dogecoin has the image of a Shiba Inu dog as its logo.",
                0.08238515893866953,
                132670764299.89409,
                10784676513.942348
            ),
            Currency(
                R.drawable.ltc,
                "LiteCoin",
                "Litecoin is a peer-to-peer Internet currency that enables instant, near-zero cost payments to anyone in the world. Litecoin is an open source, global payment network that is fully decentralized without any central authorities.",
                92.13457629161212,
                67405839.51538748,
                6153091037.208843
            ),
            Currency(
                R.drawable.pol,
                "Polygon",
                "Polygon (MATIC) is an Ethereum token that powers the Polygon Network, a scaling solution for Ethereum. Polygon aims to provide faster and cheaper transactions on Ethereum using Layer 2 sidechains, which are blockchains that run alongside the Ethereum main chain.",
                1.3040758213583956,
                10000000000.0,
                11380253305.943703
            ),
            Currency(
                R.drawable.sol,
                "Solana",
                "Solana is the fastest blockchain in the world and the fastest growing ecosystem in crypto, with over 400 projects spanning DeFi, NFTs, Web3 and more.",
                23.371231894185204,
                541535447.8260728,
                8692877996.432596
            ),
            Currency(
                R.drawable.tht,
                "Tether",
                "Launched in 2014, Tether is a blockchain-enabled platform designed to facilitate the use of fiat currencies in a digital manner. Tether works to disrupt the conventional financial system via a more modern approach to money.",
                1.0000949999952446,
                70798228838.68707,
                70804246690.2304
            ),
            Currency(
                R.drawable.usd,
                "USD Coin",
                "As an open standard and public smart contract, USDC has rapidly grown the largest stablecoin industry ecosystem in the world. Hundreds of companies, products and services support the USDC standard, including digital wallets, exchanges, DeFi protocols, savings, lending and payment services.",
                0.9997600473854763,
                7079828.687,
                70804246690.2304
            ),
            Currency(
                R.drawable.xrp,
                "XRP",
                "XRP is a digital asset built for payments. It is the native digital asset on the XRP Ledger—an open-source, permissionless and decentralized blockchain technology that can settle transactions in 3-5 seconds.",
                0.38107147423581716,
                50950912949.0,
                19187311809.96

            ),


            )

        val recycleView = findViewById<RecyclerView>(R.id.rv_currency)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.setHasFixedSize(true)
        recycleView.adapter = CurrencyAdapter(this,currencyList){
            val intent = Intent(this,DetailCurrency::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_profile -> startActivity(Intent(this,Profile::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}