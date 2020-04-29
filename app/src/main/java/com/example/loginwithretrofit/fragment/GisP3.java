package com.example.loginwithretrofit.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.loginwithretrofit.R;


public class GisP3 extends Fragment {
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // TODO Auto-generated method stub

        String data = getArguments().getString("idUser");
        Toast.makeText(getContext(),data,Toast.LENGTH_LONG).show();


        return inflater.inflate(R.layout.fragment_gis_p3, container,false);
    }

}
