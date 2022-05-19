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
    }
//    public void callME(View view){
//        Uri uri = Uri.parse("tel:+923001234567");
//        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
//        startActivity(intent);
//    }

public void onClickButton(View v) {
    if(v.getId() == R.id.yourbuttonid) {
        Button btn=findViewById(R.id.yourbuttonid);
        btn.setText("X");
    }
}
    public void CallingIntent(View view) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+"03234674427"));//change the number
        try {
            startActivity(callIntent);
        } catch (Exception e) {
            Intent callIntent2 = new Intent(Intent.ACTION_DIAL);
            callIntent2.setData(Uri.parse("tel:"+"03234674427"));//change the number
            startActivity(callIntent2);
        }


    }
}
