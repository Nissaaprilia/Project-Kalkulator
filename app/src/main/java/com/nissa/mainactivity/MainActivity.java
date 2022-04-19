package com.nissa.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            initial();

        }

        private void initial() {

        }

        public void pilihBangunRuang(View view) {
            Intent intent = new Intent(MainActivity.this, PilihBangunRuangActivity.class);
            startActivity(intent);
        }
         public void about(View view) {
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