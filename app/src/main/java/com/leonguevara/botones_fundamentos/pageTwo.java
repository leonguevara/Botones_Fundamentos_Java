package com.leonguevara.botones_fundamentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class pageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String otherName = intent.getStringExtra("nombreUsuario");
        String message;

        if (!name.equals("")) {
            message = "Welcome to the Jungle, " + name;
        } else {
            message = "INTRUDER!! Unauthorized access!";
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
