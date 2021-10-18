package id.ac.ukdw.pertemuan7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnContactClickListener {
    val listContact = arrayListOf<Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listContact.add(Contact("TorontoTirta", "081236455768", R.mipmap.tirtatokyo))
        listContact.add(Contact("PuppeySecret", "081233456778", R.mipmap.puppeysecret))
        listContact.add(Contact("DendiLegend", "081384569430", R.mipmap.dendilegend))

        val rcyContact = findViewById<RecyclerView>(R.id.rcyContact)
        rcyContact.layoutManager = LinearLayoutManager(this)
        val adapter = ContactAdapter(listContact, this, this)
        rcyContact.adapter = adapter
    }

     fun onMovieClicked(position: Int) {
         val intent = Intent(this, ContactDetail::class.java)
         intent.putExtra("nama", listContact[position].contactName)
         intent.putExtra("nomor", listContact[position].contactNum)
         intent.putExtra("alamat", "Dimana aja")
         intent.putExtra("email", "apaaja@gmail.com")
         startActivity(intent)
     }

    override fun onContactItemClicked(position: Int) {
        val intent = Intent(this, ContactDetail::class.java)
        intent.putExtra("nama", listContact[position].contactName)
        intent.putExtra("nomor", listContact[position].contactNum)
        intent.putExtra("alamat", "Dimana aja")
        intent.putExtra("email", "apaaja@gmail.com")
    }
}