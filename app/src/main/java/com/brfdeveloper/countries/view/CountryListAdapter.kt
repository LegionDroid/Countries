package com.brfdeveloper.countries.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.brfdeveloper.countries.R
import com.brfdeveloper.countries.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryListAdapter(var countries: ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newContries: List<Country>){
        countries.clear()
        countries.addAll(newContries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CountryViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position], position)
    }


    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val countryName = view.itemcountry_tv_name;

        fun bind (country: Country, position: Int){
            countryName.text = country.countryName
        }
    }
}
