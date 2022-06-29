package br.com.zup.novoaplicativo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import br.com.zup.novoaplicativo.repository.HomeRepository

class HomeViewModel(application: Application): AndroidViewModel(application) {
    private val repository = HomeRepository(application)

    fun saveInformation(login: String, password: Int) {
        repository.saveUser(login, password)
    }

    fun getLogin() = repository.getUserLogin()
    fun getPassoword() = repository.getUserPass()
}