package com.spaceneochat.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.firestore.FirebaseFirestore;
import com.spaceneochat.R;
import com.spaceneochat.databinding.ActivitySignInBinding;

import java.util.HashMap;

public class SignIn extends AppCompatActivity {

    MaterialButton Button;
    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_sign_in);
        setListeners();

        Button = findViewById(R.id.buttonSignIn);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Text", Toast.LENGTH_SHORT).show();
                addDataToFirebase();
            }
        });
    }


    //Binding is not working fix this error
    private void setListeners() {
        binding.textCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(),SignUp.class)));
        binding.buttonSignIn.setOnClickListener(v ->addDataToFirebase());

    }

    private void addDataToFirebase(){
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        HashMap<String, Object> data = new HashMap<>();
        data.put("first_name", "Shad");
        data.put("last_name", "Space");
        database.collection("users")
                .add(data)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(getApplicationContext(),"Data Entered", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(exception ->{
                    Toast.makeText(getApplicationContext(), exception.getMessage(),Toast.LENGTH_SHORT).show();
                });

    }

}