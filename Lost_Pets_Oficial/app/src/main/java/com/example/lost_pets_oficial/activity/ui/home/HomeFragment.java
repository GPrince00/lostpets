package com.example.lost_pets_oficial.activity.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.example.lost_pets_oficial.R;
import com.example.lost_pets_oficial.activity.MapsActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private Button acessar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        acessar = view.findViewById(R.id.button5);

        acessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
            }
        });

    }

}