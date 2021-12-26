package com.example.lesson5a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson5a1.fragment.first_fragment.First_Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container_fragment, new First_Fragment()).commit();


        }
    }
}