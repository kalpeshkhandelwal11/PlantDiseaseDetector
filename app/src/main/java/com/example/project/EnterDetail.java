package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EnterDetail extends AppCompatActivity {
        EditText  name, cause, cure ,e_id;
        Button sub;
        DatabaseReference mdatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_detail);

        name = findViewById(R.id.enter_dName);
        cause = findViewById(R.id.e_dCause);
        cure = findViewById(R.id.e_DCure);
        e_id = findViewById(R.id.e_dID);

        sub = findViewById(R.id.btn_sub);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disease_detail data = new disease_detail(name.getText().toString()
                        ,cause.getText().toString(),cure.getText().toString()
                        ,e_id.getText().toString());

                mdatabase = FirebaseDatabase.getInstance().getReference("/Medicine_detail");
                mdatabase.child(data.disease_id).setValue(data).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(getApplicationContext(),"data added successfully",Toast.LENGTH_SHORT).show();
                        name.setText("");
                        cure.setText("");
                        cause.setText("");
                        e_id.setText("");

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(),"Failure"+e,Toast.LENGTH_SHORT).show();

                    }
                });



            }
        });

    }
}