package com.example.gaara_000.test008;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gaara_000 on 9/6/2016.
 */
public class MVCController extends Activity /*implements DataSource*/ {
    MVCView mvcView;
    MVCModel mvcModel;

    private static final int CONTENT_VIEW_ID = 10101010;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewV viewV;
        mvcView = new MVCView();
        mvcModel = new MVCModel();
       // mvcView.check(mvcModel);


        setContentView(R.layout.fragment_view_v);

    }
    public void tinhtoan(String a, String b){
        String aname = mvcModel.name();
        String apass =mvcModel.pass();
        if(aname.equals(a)==true&&apass.equals(b)==true){

            Toast.makeText(getBaseContext(),"Dang nhap thanh cong",Toast.LENGTH_SHORT).show();
            login();
        }

        else {

            Toast.makeText(getBaseContext(),"Nhap sai",Toast.LENGTH_SHORT).show();
            loginF();
        }


    }
    public boolean login(){
        return true;

    }
    public boolean loginF(){
        return false;

    }

/*    public void tinh(){
.        if(mvcView.rename().equals(mvcModel.name())==true && mvcView.repass().equals(mvcModel.pass())==true){
.            Toast.makeText(getBaseContext(),"Dang nhap thanh cong",Toast.LENGTH_SHORT).show();
.
.
.       }
.        else {
.            Toast.makeText(getBaseContext(),"Nhap sai",Toast.LENGTH_SHORT).show();


        }

    }*/

}
