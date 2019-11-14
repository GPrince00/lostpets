package com.example.lost_pets_oficial.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lost_pets_oficial.R;
import com.example.lost_pets_oficial.activity.CadastroActivity;
import com.example.lost_pets_oficial.activity.LoginActivity;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonNextVisible(false);
        setButtonBackVisible(false);

       addSlide( new FragmentSlide.Builder()
               .background(android.R.color.white)
               .fragment(R.layout.bem_vindo)
               .build()
       );
        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .build()
        );
        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );
        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.cadastro_pets)
                .canGoForward(false)
                .build()

        );
    }

    public void btEntrar(View view){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void btCadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));

    }

}
