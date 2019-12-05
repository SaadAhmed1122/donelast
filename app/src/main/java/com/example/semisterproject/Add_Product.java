package com.example.semisterproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Add_Product extends AppCompatActivity {


    Spinner s1;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Stock");
EditText prod_name ,pro_dec,perc_price,sale_price,avai_Stock;
Products pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__product);
        s1= (Spinner) findViewById(R.id.spinner);
        String[] units= {"Tab","Packets"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,units);
        s1.setAdapter(adapter);
        prod_name = (EditText) findViewById(R.id.item_name);
        pro_dec = (EditText) findViewById(R.id.product_description);
        avai_Stock = (EditText) findViewById(R.id.existing_quantity);
        perc_price = (EditText) findViewById(R.id.purchase_cost);
        sale_price = (EditText) findViewById(R.id.et_item_sale_price);
pro = new Products();


    }
    private void getvalues(){
        pro.setPro_name(prod_name.getText().toString());
        pro.setPro_desc(pro_dec.getText().toString());
        pro.setAva_sto(avai_Stock.getText().toString());
        pro.setPro_cat(s1.getSelectedItem().toString());
        pro.setPro_p_price(perc_price.getText().toString());
        pro.setPro_s_price(sale_price.getText().toString());
    }

    public void runCode(View view) {
      //  myRef.removeValue();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               getvalues();
                myRef.push().setValue(pro);
          /*      String product_name =prod_name.getText().toString();
               String product_decript =pro_dec.getText().toString();
                String product_avastok = avai_Stock.getText().toString();
                String pr_price=  perc_price.getText().toString();
                String sal_p =sale_price.getText().toString();
                String cat = s1.getSelectedItem().toString();
        //String key= myRef.push().getKey();
                myRef.child("Product1").child("Product_Name").setValue(product_name);
                myRef.child("Product1").child("Product_Description").setValue(product_decript);
                myRef.child("Product1").child("Purchase_price").setValue(pr_price);
                myRef.child("Product1").child("Product_cat").setValue(cat);
                myRef.child("Product1").child("Sale_Price").setValue(sal_p);
                myRef.child("Product1").child("Available_stock").setValue(product_avastok);
              */  Toast.makeText(Add_Product.this, "Data insert Successfully",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }
}
