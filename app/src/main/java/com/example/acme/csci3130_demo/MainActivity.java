package com.example.acme.csci3130_demo;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Input = findViewById(R.id.Input);
        final Button button = findViewById(R.id.Copy);
        final TextView hello = findViewById(R.id.hello);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setText(Input.getText());
            }
        });
    }


}
