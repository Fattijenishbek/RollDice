package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDices = (Button)findViewById(R.id.buttonDice);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int value1= randomValue();
                    int value2= randomValue();

                    int result1= getResources().getIdentifier("dice"+value1,"drawable","com.example.rolldice");
                    int result2= getResources().getIdentifier("dice"+value2, "drawable","com.example.rolldice");

                    imageView1.setImageResource(result1);
                    imageView2.setImageResource(result2);
            }
        });
    }
    public static  int randomValue(){
        return RANDOM.nextInt(6)+1;
    }
}