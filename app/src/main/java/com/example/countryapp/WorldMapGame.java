package com.example.countryapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WorldMapGame extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.world_map_game, container, false);
        FloatingActionButton Canada1 = (FloatingActionButton) view.findViewById(R.id.canada1);
        Canada1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Canada 1", "clicked");
            }

        });

        return view;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
