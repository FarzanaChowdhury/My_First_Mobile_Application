package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if(getIntent().hasExtra("com.example.logindemo.Eleen")){
            TextView txt1 = findViewById(R.id.welcome);
            TextView  txt2 = findViewById(R.id.name);
            String text = getIntent().getExtras().getString("com.example.logindemo.Eleen");
            txt2.setText(text);
        }

        ImageButton start = findViewById(R.id.startBtn);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), com.example.login_page.ThirdActivity.class);
                startActivity(startIntent);
            }
        });

        Button exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), com.example.login_page.MainActivity.class);
                startActivity(startIntent);
            }
        });
    }
}