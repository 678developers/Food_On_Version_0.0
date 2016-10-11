package com.example.a678developers.food_on_version_00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class email_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);

        Button signup_button = (Button) findViewById(R.id.signup_btn);


        signup_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(email_login.this, signup_details.class);
                startActivity(intent);
            }
        });


        Button login_button = (Button) findViewById(R.id.login_btn);


        login_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(email_login.this, login_details.class);
                startActivity(intent);
            }
        });
    }
}
