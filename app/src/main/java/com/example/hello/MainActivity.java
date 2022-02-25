package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hello.common.Common;

public class MainActivity extends AppCompatActivity {

    String name = "Elson";
    int idade=0;
    TextView txtHello;
    TextView txtIdade;
    Button btnAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.txt_hello);
        txtHello.setText(name);

        txtIdade = findViewById(R.id.txt_idade);
        txtIdade.setText(idade);

        btnAction=findViewById(R.id.btn_action1);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.globalName = name;
                Intent clikOne = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(clikOne);
                finish();
            }
        });
    }
}