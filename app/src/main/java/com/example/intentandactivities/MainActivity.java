package com.example.intentandactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2;
        b1=findViewById(R.id.callingIntent);
        b2=findViewById(R.id.buttonOpenSecodActivity);
        b1.setOnClickListener(this::onClick);
        b2.setOnClickListener(this::onClick);
        Intent intent=getIntent();
        if(intent.getStringExtra("image")!=null){
            b2.setText(intent.getStringExtra("image"));
        }

    }



    public void CallingIntent(View view) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+"03319648810"));//change the number
        try {
            startActivity(callIntent);
        } catch (Exception e) {
            Intent callIntent2 = new Intent(Intent.ACTION_DIAL);
            callIntent2.setData(Uri.parse("tel:"+"03319648810"));//change the number
            startActivity(callIntent2);
        }


    }


    public  void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonOpenSecodActivity:
                intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                break;

            case R.id.callingIntent:
                Uri uri = Uri.parse("tel:03319648810");
                intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
                break;

            default:
                throw new
                        IllegalStateException("Unexpected value: " + v.getId());
        } }



}


