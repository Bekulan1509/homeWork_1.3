package com.example.homework_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float volue1;
    float volue2;
    boolean plus2, minus2, multiply2, devite2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.result);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.zero:
                editText.setText(editText.getText() + "0");
                break;
            case R.id.one:
                editText.setText(editText.getText() + "1");
                break;
            case R.id.two:
                editText.setText(editText.getText() + "2");
                break;
            case R.id.three:
                editText.setText(editText.getText() + "3");
                break;
            case R.id.four:
                editText.setText(editText.getText() + "4");
                break;
            case R.id.five:
                editText.setText(editText.getText() + "5");
                break;
            case R.id.six:
                editText.setText(editText.getText() + "6");
                break;
            case R.id.seven:
                editText.setText(editText.getText() + "7");
                break;
            case R.id.eight:
                editText.setText(editText.getText() + "8");
                break;
            case R.id.nine:
                editText.setText(editText.getText() + "9");
                break;
        }

    }

    public void onClick2(View v) {
        switch (v.getId()) {
            case R.id.minus:
                if (editText == null) {
                    editText.setText("");
                } else {
                    volue1 = Float.parseFloat(editText.getText() + "");
                    minus2 = true;
                    editText.setText(null);
                }
                break;
            case R.id.c:
                editText.setText("");
                break;
            case R.id.plus:
                if (editText == null) {
                    editText.setText("");
                } else
                    volue1 = Float.parseFloat(editText.getText() + "");
                plus2 = true;
                editText.setText(null);
                break;
            case R.id.devite:
                if (editText == null) {
                    editText.setText("");
                } else {

                    volue1 = Float.parseFloat(editText.getText() + "");
                    devite2 = true;
                    editText.setText(null);
                }
            case R.id.com:
                String com2 = editText.getText().toString();
                if (TextUtils.isEmpty(com2)) {
                    editText.setText("");
                } else {
                    editText.setText(editText.getText() + ",");
                }
                break;
            case R.id.multiply:
                if (editText==null){
                    editText.setText("");
                }else{
                    volue1 = Float.parseFloat(editText.getText()+"");
                    multiply2 = true;
                    editText.setText(null);
                }

        }

    }

    public void onClick3(View v) {
        volue2 = Float.parseFloat(editText.getText() + "");
        if (plus2 == true) {
            editText.setText(volue1 + volue2 + "");
            plus2 = false;
        }
        if (minus2 == true) {
            editText.setText(volue1 - volue2 + "");
            plus2 = false;
        }
        if (devite2 == true) {
            editText.setText(volue1 / volue2 + "");
            devite2 = false;
        }
        if (multiply2 == true) {
            editText.setText(volue1 * volue2 + "");
            multiply2 = false;
        }

    }

}
