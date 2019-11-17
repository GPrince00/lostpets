package com.example.lost_pets_oficial.activity;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

=======
import android.os.Bundle;
>>>>>>> a772c73c452465249169cf9b677dac38cd992f00
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
<<<<<<< HEAD
        public void btSalvar(View view){
            startActivity(new Intent(this, LoginActivity.class));

        }
=======
>>>>>>> a772c73c452465249169cf9b677dac38cd992f00
    }

