package com.example.humberto.tempconverter;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText editText;
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        editText = findViewById(R.id.temp_input);
        textView = findViewById(R.id.temp_output);
    }

    public void onClickCelToFah(View view) {
        String v = editText.getText().toString();
        double temp = ConverterUtils.celsiusToFahrenheit(
                Double.parseDouble(v)
        );
        String res = String.valueOf(temp) + "ºF";
        textView.setText(res);
    }

    public void onClickFahToCel(View view) {
        String v = editText.getText().toString();
        double temp = ConverterUtils.fahrenheitToCelsius(
                Double.parseDouble(v)
        );
        String res = String.valueOf(temp) + "ºC";
        textView.setText(res);
    }

}
