package com.example.lost_pets_oficial.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFireBase {
    private static FirebaseAuth autenticacao;

    public static FirebaseAuth getFirebaseAutenticacao(){
        if(autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}
