package com.rohmanbeny.modul6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rohmanbeny.modul6.MyData
import com.rohmanbeny.modul6.R
import kotlinx.android.synthetic.main.item_list.view.*

class ListMyDataAdapter(private val listMyData: ArrayList<MyData>):
RecyclerView.Adapter<ListMyDataAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListMyDataAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListMyDataAdapter.ListViewHolder, position: Int) {
        holder.bind(listMyData[position])
    }

    override fun getItemCount(): Int = listMyData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(myData: MyData) {
            with(itemView){
                Glide.with(itemView.context)
                    .load(myData.photo)
                    .apply(RequestOptions().override(55, 55))
                    .into(img_item_photo)
                tv_item_name.text = myData.name
                tv_item_description.text = myData.description
            }
        }
    }
}
