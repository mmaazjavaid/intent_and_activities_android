package com.example.intentandactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

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
}
