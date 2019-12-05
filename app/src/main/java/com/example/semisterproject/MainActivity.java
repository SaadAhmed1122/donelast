package com.example.semisterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void addbtn(View view) {
        try{
        Intent ii = new Intent(this, checkadmin.class);
        startActivity(ii);}
    catch (Exception aa){
        Toast.makeText(MainActivity.this,aa.getMessage(),Toast.LENGTH_SHORT).show();
        }}

    public void vie_pr(View view) {
        Intent ii = new Intent(this, Add_Product.class);
        startActivity(ii);
    }

    public void view_product(View view) {
        Intent ii = new Intent(this, view_product.class);
        startActivity(ii);
    }
}


