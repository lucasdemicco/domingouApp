package View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucas.domingou.R
import com.lucas.domingou.databinding.ActivityLoginBinding
import com.lucas.domingou.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        binding.txtCadastrar.setOnClickListener{
            var intent = Intent(this, CadastrarActivity::class.java)
            startActivity(intent)
        }

    }
}