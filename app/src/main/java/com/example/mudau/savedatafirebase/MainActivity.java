package com.example.mudau.savedatafirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText name,surname;
    private Button save;
DatabaseReference databaseReference;
 ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        surname=(EditText)findViewById(R.id.surname);
        save=(Button) findViewById(R.id.save_data);
        //progressBar.setMe

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Users");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            adddate();
            }
        });


    }
    public void adddate(){

        String Name=name.getText().toString().trim();
        String Surname=surname.getText().toString().trim();

        AddData adddata=new AddData(Name,Surname);
        databaseReference.setValue(adddata);
    }
}
