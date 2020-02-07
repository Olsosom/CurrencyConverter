package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editText);

        double num = Integer.parseInt(myTextField.getText().toString());

        goToActivity2(num);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2 (double x) {
        Intent intent = new Intent(this, Main2Activity.class);
        x = x * 0.77;
        intent.putExtra("message", x);
        startActivity(intent);
    }
}
