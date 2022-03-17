package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hello.common.Common;

public class MainActivity extends AppCompatActivity {

    String email,password;
    int idade;
    EditText edtEmail,edtPass,edtIdade;
    Button btnAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edtIdade = findViewById(R.id.edt_idade);

        edtEmail =  findViewById(R.id.edt_email);
        edtPass = findViewById(R.id.edt_password);

        btnAction=findViewById(R.id.btn_action1);
        btnAction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                verifyEmailAndPassword();

            }
        });
    }

    private void verifyEmailAndPassword() {
        email=edtEmail.getText().toString().trim();
        password=edtPass.getText().toString().trim();

        if(!email.isEmpty() && !password.isEmpty()){
            Intent clickOne = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(clickOne);
            finish();
            finishAffinity();
        }
        else{
            Toast.makeText(this, "Login ou Senha incorretos", Toast.LENGTH_SHORT).show();
        }
    }
}