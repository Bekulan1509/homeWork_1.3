package com.example.homework_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;

TextView sum = textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);


    }
    public void onClick(View v){
Integer.parseInt(textView+"");
Integer.parseInt(sum+"");

        switch (v.getId()){
            case R.id.zero:
                Integer.parseInt(0+"");
                textView.append(0+"");
                break;
            case R.id.one:
                textView.append(1+"");
                break;
            case R.id.two:
                Integer.parseInt(2+"");
                textView.append("2");
                break;
            case R.id.three:
                Integer.parseInt(3+"");
                textView.append("3");
                break;
            case R.id.four:
                Integer.parseInt(4+"");
                textView.append("4");
                break;
            case R.id.five:
                Integer.parseInt(5+"");
                textView.append("5");
                break;
            case R.id.six:
                Integer.parseInt(6+"");
                textView.append("6");
                break;
            case R.id.seven:
                Integer.parseInt(7+"");
                textView.append("7");
                break;
            case R.id.eight:
                Integer.parseInt(8+"");
                textView.append("8");
                break;
            case R.id.nine:
                Integer.parseInt(9+"");
                textView.append("9");
                break;
        }

        //int first = Integer.parseInt(textView.getText().toString());

    }
    public void onClick2 (View v){
        switch (v.getId()){
            case R.id.minus:
               sum = sum-textView;
                break;
            case R.id.c:
                textView.setText("");
                break;
            case R.id.plus:
                break;
        }

    }


}
