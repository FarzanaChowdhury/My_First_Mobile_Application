package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    private Button changeBgButton, Back;
    private View bgImage;
    private int[] imageResources = new int[]{R.drawable.flower_bg, R.drawable.cute_bg, R.drawable.ful_bg, R.drawable.kitty_bg};
    private int currentImageIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        changeBgButton = (Button) findViewById(R.id.change_bg);
        ImageView bgImage = (ImageView)findViewById(R.id.background);

        changeBgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImageIndex = (currentImageIndex + 1) % imageResources.length;
                bgImage.setImageResource(imageResources[currentImageIndex]);
            }
        });

        Back = (Button) findViewById(R.id.backBtn);
        Back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), com.example.login_page.SecondActivity.class);
                startActivity(startIntent);
            }
        });

    }


}