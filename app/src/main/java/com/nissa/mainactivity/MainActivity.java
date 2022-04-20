package com.nissa.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnbangundatar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {pilihBangunDatar(); }
        });

        button = (Button) findViewById(R.id.btnbangunruang);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {pilihBangunRuang(); }
        });

        button = (Button) findViewById(R.id.about_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {about(); }
        });
        }
        public void pilihBangunDatar() {
            Intent intent = new Intent(MainActivity.this, PilihBangunDatarActivity.class);
            startActivity(intent);
        }

        public void pilihBangunRuang() {
        Intent intent = new Intent(MainActivity.this, PilihBangunRuangActivity.class);
        startActivity(intent);
         }
         public void about() {
        Intent intent = new Intent(MainActivity.this, activity_about.class);
        startActivity(intent);
        }
}

      /* getSupportActionBar().hide();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 5000L); //5000 L = 5 detik */