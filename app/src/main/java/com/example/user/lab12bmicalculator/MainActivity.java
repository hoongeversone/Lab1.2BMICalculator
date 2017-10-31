package com.example.user.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText editTextWeight, editTextHeight;
    private ImageView imageViewResult;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);
        textViewResult = (TextView)findViewById(R.id.textViewBMI);
    }

    public void calculateBMI(View view)
    {
        double weight, height;
        double BMIResult;

        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        BMIResult = weight / (height * height);
        if (BMIResult <= 18.5)
        {
            textViewResult.setText("Under Weight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if (BMIResult > 18.5 && BMIResult < 21)
        {
            textViewResult.setText("Normal weight");
            imageViewResult.setImageResource(R.drawable.normal);
        }
        else
        {
            textViewResult.setText("Over weight");
            imageViewResult.setImageResource(R.drawable.over);
        }
    }

    public void Reset(View view)
    {
        editTextHeight.setText("");
        editTextWeight.setText("");
        textViewResult.setText("");
        imageViewResult.setImageResource(R.drawable.empty);

    }
}
