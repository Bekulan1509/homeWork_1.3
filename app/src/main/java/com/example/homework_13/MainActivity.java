package com.example.homework_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;

String sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);


    }
    public void onClick(View v){


        switch (v.getId()){
            case R.id.zero:
                Integer.parseInt(0+"");
                textView.append("0");
                break;
            case R.id.one:
                textView.append("1");
                break;
            case R.id.two:
                textView.append("2");
                break;
            case R.id.three:
                textView.append("3");
                break;
            case R.id.four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.six:
                textView.append("6");
                break;
            case R.id.seven:
                textView.append("7");
                break;
            case R.id.eight:
                textView.append("8");
                break;
            case R.id.nine:
                textView.append("9");
                break;
        }

        //int first = Integer.parseInt(textView.getText().toString());

    }
    public void onClick2 (View v){
        switch (v.getId()){
            case R.id.minus:
              // sum = textView-textView;
                break;
            case R.id.c:
                textView.setText("");
                break;

        }

    }


}
