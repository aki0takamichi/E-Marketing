package com.example.gaara_000.test008;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
// bo model
// them implement
public class MVCView extends Activity  {
    //MVCModel mvcModel;
    MVCController mvcController;
    EditText edname,edpass;
    Button btndangnhap;
    TextView tvShowMess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvcview);
       mvcController = new MVCController();

        edname =(EditText)findViewById(R.id.edname);
        edpass =(EditText)findViewById(R.id.edpass);
        btndangnhap=(Button)findViewById(R.id.btndangnhap);
        tvShowMess =(TextView)findViewById(R.id.showMess);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // check(mvcModel);
              /*  MVCController mvcController = new MVCController();*/

                String ac = edname.getText().toString();
                String bc = edpass.getText().toString();
                mvcController.tinhtoan(ac,bc);
            }
        });
    }/*
    public void check(MVCModel mvcModel){
        mvcModel.name();
        String anc =mvcModel.name();
        String passs = mvcModel.pass();

        String ac = edname.getText().toString();
        String bc = edpass.getText().toString();
        if(ac.equals(anc)==true && bc.equals(passs)==true){

            Toast.makeText(getBaseContext(),"Dang nhap thanh cong",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getBaseContext(),"Nhap sai",Toast.LENGTH_SHORT).show();

        }


    }*/
}
// imp