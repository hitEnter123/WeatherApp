package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

    final String TAG = "WeatherApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);
        final EditText editTextField = findViewById(R.id.queryET);
        ImageButton backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        editTextField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String newCity = editTextField.getText().toString();
                Intent newCityIntent = new Intent(ChangeCityController.this, WeatherController.class);
                newCityIntent.putExtra("City", newCity);
                setResult(Activity.RESULT_OK, newCityIntent);
                Log.d(TAG,"new city: " + newCity);
                finish();
                return false;
            }
        });
    }
}
