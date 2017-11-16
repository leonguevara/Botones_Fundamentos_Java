package com.leonguevara.botones_fundamentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class pageOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        Intent intent = getIntent();
        Integer givenNumber = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        Toast.makeText(getApplicationContext(), String.format("%d", givenNumber) , Toast.LENGTH_LONG).show();
    }
}
