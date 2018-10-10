package com.example.system.login_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText name,password,email,phone_no,re_password;
    Button loginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText) findViewById(R.id.entername);
        email = (EditText) findViewById(R.id.enter_email);
        password = (EditText) findViewById(R.id.enter_pass);
        re_password = (EditText) findViewById(R.id.enter_re_pass);
        phone_no = (EditText) findViewById(R.id.enter_phone);
        loginbtn = (Button) findViewById(R.id.register);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.length() == re_password.length()) {


                    Intent intent = new Intent(MainActivity.this,show.class);//use intent to switch a page using class page name

                    intent.putExtra("name", name.getText().toString()); //to show a data on other page
                    intent.putExtra("email", email.getText().toString());
                    intent.putExtra("phone", phone_no.getText().toString());
                    startActivity(intent);
                }
                else {

                    Toast.makeText(getApplicationContext(), "password does not matched", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }
}
