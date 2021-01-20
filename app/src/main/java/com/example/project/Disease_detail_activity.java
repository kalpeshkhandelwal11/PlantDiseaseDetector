package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Disease_detail_activity extends AppCompatActivity {
    TextView name, cure, cause;
    Button got_chat;
    String disease_id;
    private DatabaseReference mDatabase;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_detail_activity);

       name = findViewById(R.id.print_name);
       cure = findViewById(R.id.print_cure);
       cause = findViewById(R.id.print_cause);
       got_chat = findViewById(R.id.goto_chat);

        disease_id = getIntent().getStringExtra("disease_id");

        if(disease_id != "")
        {
            mDatabase = FirebaseDatabase.getInstance().getReference("/Medicine_detail/"+disease_id);

            //event listener
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    //to check if the data exists
                    if (snapshot.exists()) {

                        // Data can also be retrived via for loop
                        disease_detail data = snapshot.getValue(disease_detail.class);

                        // setting data to the view
                        name.setText(data.disease_name);
                       cause.setText(data.disease_cause);
                        cure.setText(data.disease_cure);


                    }else
                    {
                        Toast.makeText(getApplicationContext(),"Data does not exist",Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });



        }
            got_chat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),chat_activity.class));
                }
            });


    }

}