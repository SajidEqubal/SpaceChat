package com.spaceneochat.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.spaceneochat.R;
import com.spaceneochat.databinding.ActivitySignInBinding;
import com.spaceneochat.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {
    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_sign_up);
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(),SignUp.class)));
    }
}