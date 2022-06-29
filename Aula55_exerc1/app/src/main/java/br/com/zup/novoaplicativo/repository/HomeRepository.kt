package br.com.zup.novoaplicativo.repository

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import br.com.zup.novoaplicativo.KEY
import br.com.zup.novoaplicativo.LOGIN
import br.com.zup.novoaplicativo.PASSWORD

class HomeRepository(application: Application) {

    private val pref: SharedPreferences = application.getSharedPreferences(KEY, Context.MODE_PRIVATE)
    private val prefEditor = pref.edit()

    fun saveUser(login: String, password: Int){
        prefEditor.putString(LOGIN, login)
        prefEditor.putInt(PASSWORD, password)
        prefEditor.apply()
    }

    fun getUserLogin() = pref.getString(LOGIN, "")

    fun getUserPass() = pref.getInt(PASSWORD, 0)

}