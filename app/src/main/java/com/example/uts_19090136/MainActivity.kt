package com.example.uts_19090136

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.ipa,"IPA","Rp178.000","Penerbitan Erlangga .untuk SMP kelas 7 "))

        data?.add(DataModel(R.drawable.ips,"ips","Rp155.000", "Penerbitan Erlangga .untuk SMP kelas 7"))

        data?.add(DataModel(R.drawable.matematika,"Matematika","Rp120.000", "Penerbit Erlangga .untuk SMP kelas 7"))

        data?.add(DataModel(R.drawable.buku_kotlin,"buku_kotlin","Rp130.000", "untuk membuat aplikasi android dengan android studio"))

        data?.add(DataModel(R.drawable.malin_kundang,"malin_kundang","Rp115.000", "Cerita rakyat yang berasal dari provinsi sumatra barat,indonesia" +
                "Malin kundang berkisah tentang seorang anak yang durhaka pada ibunya maka dikutuk jadi batu. "
                ))

        data?.add(DataModel(R.drawable.excel,"excel","Rp125.000", "buku excel ini untuk orang yang masih awam terhadap microsoft excel."+"jadi untuk mempermudah mempelajarai excel "))



        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

}