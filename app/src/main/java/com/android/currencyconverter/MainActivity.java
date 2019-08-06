package com.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarAmount = (EditText) findViewById(R.id.et_currency);

        double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());

        double egpAmount = dollarAmountDouble * 16.74;

        Toast.makeText(MainActivity.this, "EGP: " + String.format("%.2f", egpAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmount.getText().toString());

    }
}
