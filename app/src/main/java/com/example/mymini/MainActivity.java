package com.example.mymini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button harryButton, hermioneButton, ronButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        harryButton = (Button) findViewById(R.id.harryButtonId);
        hermioneButton = (Button) findViewById(R.id.hermioneButtonId);
        ronButton = (Button) findViewById(R.id.ronButtonId);

        harryButton.setOnClickListener(this);
        hermioneButton.setOnClickListener(this);
        ronButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.harryButtonId) {

            Intent intent;
            intent = new Intent(MainActivity.this,profileActivity.class);
            intent.putExtra("name","harry");
            startActivity(intent);

        }
        if (v.getId() == R.id.hermioneButtonId) {

            Intent intent;
            intent = new Intent(MainActivity.this,profileActivity.class);
            intent.putExtra("name","hermione");
            startActivity(intent);

        }
        if (v.getId() == R.id.ronButtonId) {

            Intent intent;
            intent = new Intent(MainActivity.this,profileActivity.class);
            intent.putExtra("name","ron");
            startActivity(intent);

        }
    }


}
