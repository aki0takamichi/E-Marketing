package com.example.gaara_000.test008;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class ViewV extends Fragment {
    MVCController mvcController;
    MVCModel mvcModel;
   public ViewV() {
        // Required empty public constructor
    }
 public static ViewV newInstance(String param1, String param2) {
        ViewV fragment = new ViewV();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mvcController = new MVCController();
        View view =inflater.inflate(R.layout.fragment_view_v,container,false);
        final EditText edName =(EditText)view.findViewById(R.id.edname);
        final EditText edPass =(EditText) view.findViewById(R.id.edpass);

        Button btnLogIn =(Button)view.findViewById(R.id.btndangnhap);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edName.getText().toString();
                String b = edPass.getText().toString();
                mvcModel.checkAcc(a,b);

            }
        });
        return view;
    }


}
