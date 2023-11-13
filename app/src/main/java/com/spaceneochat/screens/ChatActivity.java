package com.spaceneochat.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.spaceneochat.databinding.ActivityChatBinding;
import com.spaceneochat.models.User;
import com.spaceneochat.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }


    private void setListeners() {
        binding.imageBack.setOnClickListener(v->onBackPressed());
    }

    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USERS);
        binding.textName.setText(receiverUser.name);
    }
}