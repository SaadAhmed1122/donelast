package com.example.semisterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class verify_code extends AppCompatActivity {
TextView useer,passw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        useer = (TextView) findViewById(R.id.username);
        passw = (TextView) findViewById(R.id.pass);

    }


    public void enter_admin(View view) {
    if(useer.getText().toString() == "admin" && passw.getText().toString()=="1122")
    {
        Intent na= new Intent(verify_code.this, Add_Product.class);
        startActivity(na);
    }
    }
}
