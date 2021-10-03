package id.ac.ukdw.pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val username = intent.getStringExtra("nama")
        val welcome = findViewById<TextView>(R.id.txtWelcome)
        welcome.text = "Welcome ${username}"
    }
}