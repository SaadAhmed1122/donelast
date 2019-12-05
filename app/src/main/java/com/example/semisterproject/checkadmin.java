package com.example.semisterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class checkadmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkadmin);
       // Button logina = findViewById(R.id.subbut);
        //final TextView phoneno = findViewById(R.id.phonetext);

    }

    public void admin_btn(View view) {
        Intent nn= new Intent(this, verify_code.class);
        startActivity(nn);
    }

    public void user_add_btn(View view) {
        Intent nn= new Intent(checkadmin.this, enter_phone.class);
        startActivity(nn);

    }
}
