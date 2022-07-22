package com.example.new_elec_car_company

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.new_elec_car_company.model.Data
import com.example.new_elec_car_company.model.Item


class CarListAdapter(val buttonClicked : (Data) -> Unit ) : ListAdapter<Data, CarListAdapter.ItemViewHolder>(differ) {

        inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

            fun bind(data: Data) {
                val address = itemView.findViewById<TextView>(R.id.addressTextView)
                val searchButton = itemView.findViewById<Button>(R.id.searchButton)

                address.text = data.addr

                searchButton.setOnClickListener {
                    buttonClicked(data)
                    //Toast.makeText(itemView.context, "${data.csNm}", Toast.LENGTH_SHORT).show()
                }
            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(inflater.inflate(R.layout.item_station,parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(currentList.get(position))
    }

    companion object {
        val differ = object : DiffUtil.ItemCallback<Data>() {
            override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
                return oldItem.addr == newItem.addr
            }

            override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
                return oldItem == newItem
            }

        }
    }
}






































