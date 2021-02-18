package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                EditText fetch= (EditText) findViewById(R.id.range);
                TextView res= (TextView) findViewById(R.id.result);
                int range = Integer.parseInt(fetch.getText().toString());
                Random random=new Random();
                int randomNumber=random.nextInt(range-0)+0;
                res.setText(Integer.toString(randomNumber));
            }
        });
    }
}