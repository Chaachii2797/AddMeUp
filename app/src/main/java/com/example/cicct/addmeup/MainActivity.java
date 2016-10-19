package com.example.cicct.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText up;
    EditText down;
    TextView result;
    Button btn;
    Double num1, num2, sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        up=(EditText)findViewById(R.id.firstTxt);
        down=(EditText)findViewById(R.id.secondTxt);
        result=(TextView)findViewById(R.id.sumTxt);
        btn=(Button)findViewById(R.id.equals);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(up.getText().toString());
                num2=Double.parseDouble(down.getText().toString());
                sum=num1+num2;
                result.setText(Double.toString(sum));
            }
        });
    }
}
