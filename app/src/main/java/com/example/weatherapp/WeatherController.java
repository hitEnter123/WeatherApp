package com.example.weatherapp;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherController extends AppCompatActivity {

    //Constants:
    String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";
    //App ID to use OpenWeather data
    String APP_ID = "28a537f3ca6e4f53f2d3ac9c6a6de84e";
    //Time between location updates (5000 milliseconds or 5 seconds)
    long MIN_TIME = 5000;
    //Distance between location updates (1000m or 1km)
    float MIN_DISTANCE = 1000;

    //TODO: Set LOCATION_PROVIDER

    //Member Variables:
    boolean mUseLocation = true;
    TextView mCityLabel;
    ImageView mWeatherImage;
    TextView mTemperatureLabel;

    //TODO: Declare a LocationManager and a LocationListener here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_controller_layout);

        //Linking the elements in the layout to Java Code
        mCityLabel = findViewById(R.id.locationTV);
        mWeatherImage = findViewById(R.id.weatherSymbolIV);
        mTemperatureLabel = findViewById(R.id.tempTV);
        ImageButton changeCityButton = findViewById(R.id.changeCityButton);

        //TODO: Add an OnClickListener to the changeCityButton here:
    }

    //TODO: Add onResume() here:

    //TODO: Add onActivityResult() here:

    //TODO: Add getWeatherForNewCity(String city) here:

    //TODO: Add getWeatherForCurrentLocation() here:

    //TODO: Add fetchCoordinates(Location location) here:

    //TODO: Add letsDoSomeNetworking(RequestParams params) here:

    //TODO: Add updateUI() here:

    //TODO: Add onPause() here:
}
