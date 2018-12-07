package com.example.ybcf8.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);

        Button botton_1 = findViewById(R.id.wexin);
        Button botton_2 = findViewById(R.id.qq);
        Button botton_3 = findViewById(R.id.wb);
        Button botton_4 = findViewById(R.id.email);
        botton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorldActivity.this,"已用微信登陆",Toast.LENGTH_SHORT).show();
            }
        });
        botton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorldActivity.this,"已用QQ登陆",Toast.LENGTH_SHORT).show();
            }
        });
        botton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorldActivity.this,"已用微博登陆",Toast.LENGTH_SHORT).show();
            }
        });
        botton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorldActivity.this,"已用邮箱登陆",Toast.LENGTH_SHORT).show();
            }
        });

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });

        Button register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, registerActivity.class);
                startActivity(intent);
            }
        });

    }
}
