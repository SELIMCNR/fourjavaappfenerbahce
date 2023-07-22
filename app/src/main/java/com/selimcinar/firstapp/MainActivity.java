package com.selimcinar.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    TextView resultText;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         number1Text = findViewById(R.id.sayi1Text);
         resultText = findViewById(R.id.sonucText);
         imageView = findViewById(R.id.imageView);

    }
    public  void Seç(View view){
        if (number1Text.getText().toString().matches(""))
        {
            resultText.setText("Enter number");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            if (number1==1){
                imageView.setImageResource(R.drawable.resim);
            }
            else if (number1==2){
                imageView.setImageResource(R.drawable.resim2);
            }
            else if (number1==3) {
                imageView.setImageResource(R.drawable.indir);
            }
        }
        }




}