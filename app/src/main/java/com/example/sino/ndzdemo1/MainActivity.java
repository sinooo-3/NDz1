package com.example.sino.ndzdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
boolean  led1state=true
        ,led2state=true
        ,buzstate=false;
    ToggleButton led1,led2,buz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        led1= (ToggleButton) findViewById(R.id.tb);
        led2= (ToggleButton) findViewById(R.id.tb2);
        buz= (ToggleButton) findViewById(R.id.tb3);
        led1.setOnClickListener(this);
        led2.setOnClickListener(this);
        buz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tb:
                if (led1state){
//                    close();
               led1state=false;
                }else {
//                    open();
                    led1state=true;
                }
                break;
            case R.id.tb2:
                if (led2state){
//                    close();
                    led2state=false;
                }else {
//                    open();
                    led2state=true;
                }
                break;
            case R.id.buz:
                if (buzstate){
//                    close();
                    buzstate=false;
                }else {
//                    open();
                    buzstate=true;
                }
                break;
        }
    }
}
