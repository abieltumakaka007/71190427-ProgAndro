package id.ac.ukdw.pertemuan7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var listContact: ArrayList<Contact>, var context: Context, var onContactClickListener: OnContactClickListener): RecyclerView.Adapter<ContactAdapter.ContactHolder>(){
    class ContactHolder(val view: View): RecyclerView.ViewHolder(view) {
        fun bind(contact: Contact, context: Context, position: Int) {
            view.findViewById<ImageView>(R.id.imageContact).setImageResource(contact.cover)
            view.findViewById<TextView>(R.id.txtJudul).setText(contact.contactName)
            view.findViewById<TextView>(R.id.txtNomor).setText(contact.contactNum)
            view.setOnClickListener {
                OnContactClickListener.onContactItemClicked()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactHolder(v)
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        holder.bind(listContact[position], context)
    }

    override fun getItemCount(): Int {
        return listContact.size
    }
}