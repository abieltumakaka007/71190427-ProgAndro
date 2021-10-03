package id.ac.ukdw.pertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.InputUsername)
        val password = findViewById<EditText>(R.id.InputPassword)
        val buttonLogin = findViewById<Button>(R.id.ButtonLogin)
        val notifikasi = findViewById<TextView>(R.id.SalahPassword)

        buttonLogin.setOnClickListener {
            if (password.text.toString() == "1234") {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("nama", username.text.toString())
                startActivity(intent)
            }
            else {
                notifikasi.text = "Password yang anda masukkan salah."
            }
        }
    }
}


