package br.com.zup.novoaplicativo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import br.com.zup.novoaplicativo.databinding.ActivityHomeBinding
import br.com.zup.novoaplicativo.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this)[HomeViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindingView()
        binding.btnSalvar.setOnClickListener {
            viewModel.saveInformation(
                binding.etLogin.text.toString(),
                binding.etPass.text.toString().toInt())
        }
    }

    private fun bindingView() {
        binding.etLogin.setText(viewModel.getLogin())
        binding.etPass.setText(viewModel.getPassoword().toString())
    }
}