package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.login_page.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText un = findViewById(R.id.user);
                EditText pw = findViewById(R.id.pass);

                String username = un.getText().toString();
                String password = pw.getText().toString();

                Intent startIntent = new Intent(getApplicationContext(), com.example.login_page.SecondActivity.class);
                startIntent.putExtra("com.example.logindemo.Eleen",username);
                startActivity(startIntent);
            }
        });
    }
}