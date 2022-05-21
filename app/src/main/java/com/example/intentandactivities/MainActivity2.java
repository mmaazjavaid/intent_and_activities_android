package com.example.intentandactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maaz);
        Button b1=findViewById(R.id.CallBrother);
        b1.setOnClickListener(this);
        Button b2=findViewById(R.id.browserButton);
        b2.setOnClickListener(this);
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
            default:
                return;
        }

    }

}
