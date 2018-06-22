package com.example.dhurvupadhyaya.snakesandladder;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] myDices = {
            R.drawable.one,

            R.drawable.two,

            R.drawable.three,

            R.drawable.four,

            R.drawable.five,

            R.drawable.six

    };
    public void onButtonTapped(View view){
        Log.i("Button","Button was tapped");

        buttonAnimation();
        Random random = new Random();
        int randomNumber = random.nextInt(6);

        ImageView dice = findViewById(R.id.dice);
        dice.setImageResource(myDices[(randomNumber)]);


    }
    public void buttonAnimation(){
        Button myButton = findViewById(R.id.button);
        myButton.setBackgroundColor(Color.WHITE);
        myButton.setTextColor(Color.BLACK);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
