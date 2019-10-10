package com.example.lost_pets_oficial.activity;


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View
import android.widget.EditText
import android.widget.Toast

import com.example.lost_pets_oficial.R;

public class LoginActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun entrarNoApp(v:View){
        var etLogin = v.findViewById<EditText>(R.id.etLogin)
        var etSenha = v.findViewById<EditText>(R.id.etSenha)

        if(!etLogin.text.isEmpty()){
            if(!etSenha.text.isEmpty()){
                if(etSenha.text.toString() == "biruliru"){
                    val homeActivity = Intent(this,HomeActivity::class.java)
                    homeActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    startActivity(homeActivity)
                } else{
                    Toast.makeText(this, "Login ou senha inválidos, preencha corretamente!",Toast.LENGTH_SHORT).show()
                }
            } else{
                Toast.makeText(this, "Preencha a Senha!",Toast.LENGTH_LONG).show()
            }
        } else{
            Toast.makeText(this,"Preencha o Login!",Toast.LENGTH_SHORT).show()
        }
    }
}
