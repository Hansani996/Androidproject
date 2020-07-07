package com.ijse.myapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button)findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNum = (EditText)findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText)findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView)findViewById(R.id.resultTextView);


                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int result = num1 + num2;
                resultText.setText(result + "");

            }
        });

        Button subBtn = (Button)findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNum = (EditText)findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText)findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView)findViewById(R.id.resultTextView);

                int sub1 = Integer.parseInt(firstNum.getText().toString());
                int sub2 = Integer.parseInt(secondNum.getText().toString());
                int subResult = sub1 - sub2;
                resultText.setText(subResult + "");
            }
        });

        Button mulBtn = (Button)findViewById(R.id.multiplyBtn);
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNum = (EditText)findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText)findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView)findViewById(R.id.resultTextView);

                int mul1 = Integer.parseInt(firstNum.getText().toString());
                int mul2 = Integer.parseInt(secondNum.getText().toString());
                int mulResult = mul1 * mul2;
                resultText.setText(mulResult + "");
            }
        });

        Button devBtn = (Button)findViewById(R.id.devBtn);
        devBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNum = (EditText)findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText)findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView)findViewById(R.id.resultTextView);

                int dev1 = Integer.parseInt(firstNum.getText().toString());
                int dev2 = Integer.parseInt(secondNum.getText().toString());
                int devResult = dev1 / dev2;
                resultText.setText(devResult + "");
            }
        });
    }
}
