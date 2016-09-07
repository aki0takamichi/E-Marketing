package com.example.gaara_000.test008;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by gaara_000 on 9/6/2016.
 */
public class MVCModel  {
    MVCController mvcController =new MVCController();
    String ab[] = {"admin","admin"};


    //void name();

     public String name(){

        return ab[0];
    }
    public String pass(){
        return ab[1];

    }
    public void checkAcc(String a, String b){
        if(name().equals(a)==true&&pass().equals(b)){
            mvcController.show();
        }
        else {
            mvcController.showF();
        }

    }
}
