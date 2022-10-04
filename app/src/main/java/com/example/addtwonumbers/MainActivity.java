package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button add;
    private EditText input1 ,input2 ;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.button);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        output = findViewById(R.id.output);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());

                int sum = num1 + num2 ;

                output.setText(Integer.toString(sum));
            }
        });

    }
}