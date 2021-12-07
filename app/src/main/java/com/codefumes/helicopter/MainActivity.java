package com.codefumes.helicopter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText noOfHeli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noOfHeli = findViewById(R.id.heliTxt);
        findViewById(R.id.populate).setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,noOfHeli.getText(),Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.populate).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });
    }

}