package com.example.chapter3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val context: Context,
                     private val contact: List<Contact>,
                     val listener: (Contact) -> Unit)
    : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val fotoProfil = view.findViewById<ImageView>(R.id.imvCiAvatar)
        val nama = view.findViewById<TextView>(R.id.tvCiNama)
        val noHp = view.findViewById<TextView>(R.id.tvCiNoHp)
        val deskripsi = view.findViewById<TextView>(R.id.tvCiDesc)

        fun bindView(contact: Contact, listener: (Contact) -> Unit) {
            fotoProfil.setImageResource(contact.fotoProfil)
            nama.text = contact.nama
            noHp.text = contact.noHp
            deskripsi.text = contact.deskripsi
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(
            LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bindView(contact[position], listener)
    }

    override fun getItemCount(): Int = contact.size

}
//: RecycleView.Adapter<ContactAdapter.ViewHolder>()
//
//class ViewHolder(itemView: View) : RecycleView.ViewHolder(itemView) {
//    val nama = itemView.findViewById<TextView>(R.id.tvRvNama)
//    val noHp = itemView.findViewById<TextView>(R.id.tvRvNoHp)
//}
//
//override fun onCreateViewHolder(parent: ViewGroup, viewTypes: Int): ViewHolder {
//    val view = LayoutInflater.from(parent.context)
//        .inflate(R.layout.contact_item, parent, false)
//    return ViewHolder(view)
//}
//
//override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//    holder.nama.text = listContact[position].nama
//    holder.noHp.text = listContact[position].nama
//}
//
//override fun getItemCount(): Int {
//    return listContact.size
//}