package com.example.lost_pets_oficial.activity;

import android.os.Bundle;
import com.example.lost_pets_oficial.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

    public class CadastroActivity extends IntroActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_main);

            setButtonNextVisible(false);
            setButtonBackVisible(false);

            addSlide(new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.cad_intro1)
                    .build()
            );
            addSlide(new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.cad_intro3)
                    .build()
            );
            addSlide(new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.cad_intro2)
                    .build()
            );
            addSlide(new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.cad_intro4)
                    .build()
            );
            addSlide(new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.cad_intro5)
                    .build()
            );
            addSlide(new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.cad_intro6)
                    .canGoForward(false)
                    .build()

            );
        }
    }

