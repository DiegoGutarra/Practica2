package com.example.reproductormp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button siguiente;
    ViewPager viewPager;
    ArrayList<Integer> images = new ArrayList<>();
    ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        images.add(R.drawable.fondo1);
        images.add(R.drawable.fondo2);
        images.add(R.drawable.fondo3);
        images.add(R.drawable.fondo4);
        images.add(R.drawable.fondo5);

        adapter = new ViewPagerAdapter(this, images);
        viewPager.setPadding(100,0,100,0);
        viewPager.setAdapter(adapter);

        siguiente=(Button) findViewById(R.id.btnIr);

        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, MainReproductor.class);
                startActivity(i);

            }
        });
    }
}
