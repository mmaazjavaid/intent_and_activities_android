package com.example.intentandactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.util.Log;
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maaz);
        Button b1=findViewById(R.id.CallBrother);
        b1.setOnClickListener(this);
        Button b2=findViewById(R.id.browserButton);
        b2.setOnClickListener(this);
        Button b3=findViewById(R.id.emailButton);
        b3.setOnClickListener(this);
        Button b4=findViewById(R.id.passValuesButton);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.CallBrother:
                intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+"03319648810"));
                startActivity(intent);
                break;
            case R.id.browserButton:

                Uri webpage = Uri.parse("http://www.google.com");
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                Button b=findViewById(R.id.browserButton);
                b.setText("opened");
                startActivity(intent);
                break;
            case R.id.emailButton:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mmaazj323@gmail.com"});
                intent.putExtra(Intent.EXTRA_CC, new String[]{"bsef19a010@pucit.edu.pk"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "ANDROID TESTING EMAIL");
                intent.putExtra(Intent.EXTRA_TEXT, "HEY you both I AM TESTING MY ANDROID APP THANK YOU . ");
                startActivity(Intent.createChooser(intent, "Send mail..."));
                finish();
            case R.id.passValuesButton:
                intent=new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("image","counting");
                startActivity(intent);
                finish();
                break;
            default:
                return;
        }

    }

}
