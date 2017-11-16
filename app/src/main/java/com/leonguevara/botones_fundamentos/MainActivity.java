package com.leonguevara.botones_fundamentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.leonguevara.botones_fundamentos.number";
    public static final String EXTRA_MESSAGE = "com.leonguevara.botones_fundamentos.message";

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPage(View view) {
        Intent intent;
        Switch mySwitch = (Switch) findViewById(R.id.pageSwitch);
        if (mySwitch.isChecked()) {
            name = "";
            EditText nameText = (EditText) findViewById(R.id.nameText);
            name = nameText.getText().toString().trim();

            intent = new Intent(this, pageTwo.class);
            intent.putExtra(EXTRA_MESSAGE, name);
            intent.putExtra("nombreUsuario", name);

        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            Toast.makeText(getApplicationContext(), String.format("%d", (Integer) randomNumber), Toast.LENGTH_LONG).show();
            intent = new Intent(this, pageOne.class);
            intent.putExtra(EXTRA_NUMBER, randomNumber);
        }
        startActivity(intent);
    }

    public void goToThirdPage(View view) {
        Intent intent = new Intent(this, pageThree.class);
        startActivity(intent);
    }
}
