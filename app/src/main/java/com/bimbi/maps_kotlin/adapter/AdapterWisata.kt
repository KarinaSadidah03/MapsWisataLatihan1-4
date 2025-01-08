package com.bimbi.maps_kotlin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bimbi.maps_kotlin.DetailWisataMapsActivity
import com.bimbi.maps_kotlin.R
import com.bimbi.maps_kotlin.model.ModelWisata


class AdapterWisata(
    val listItemWisata: List<ModelWisata>

): RecyclerView.Adapter<AdapterWisata.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        //layout pada widget
        val imgWisata: ImageView = itemView.findViewById(R.id.imgWisata)
        val tvNamaTempatWisata: TextView = itemView.findViewById(R.id.tvNamaTempatWisata)
        val tvAlamat: TextView = itemView.findViewById(R.id.tvAlamat)
        val cardWisata: CardView = itemView.findViewById(R.id.cardWisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_wisata,parent,false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = listItemWisata[position]
        holder.imgWisata.setImageResource(currentItem.gambarWisata)
        holder.tvNamaTempatWisata.text = currentItem.namaLokasiWisata
        holder.tvAlamat.text = currentItem.alamatWisata
        //even klik pada card view
        holder.cardWisata.setOnClickListener {
            val intentDetailWisata = Intent(holder.itemView.context,DetailWisataMapsActivity::class.java)
            //kirim data list item wisatake detailwisatamapsact
            intentDetailWisata.putExtra("namaLokasiWisata",currentItem.namaLokasiWisata)
            intentDetailWisata.putExtra("gambarWisata",currentItem.gambarWisata)
            intentDetailWisata.putExtra("deskripsiWisata",currentItem.deskripsiWisata)
            intentDetailWisata.putExtra("latWisata",currentItem.latWisata)
            intentDetailWisata.putExtra("longWisata",currentItem.longWisata)
            //start
            holder.itemView.context.startActivity(intentDetailWisata)
        }
    }

    override fun getItemCount(): Int {
        return listItemWisata.size
        }
}