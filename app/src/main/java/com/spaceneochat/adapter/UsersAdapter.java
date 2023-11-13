package com.spaceneochat.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.spaceneochat.databinding.ItenContainersUserBinding;
import com.spaceneochat.models.User;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    private final List<User> users;

    public UsersAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItenContainersUserBinding itenContainersUserBinding = ItenContainersUserBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new UserViewHolder(itenContainersUserBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.setUserData(users.get(position));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }


    class UserViewHolder extends RecyclerView.ViewHolder {
        ItenContainersUserBinding binding;

        UserViewHolder(ItenContainersUserBinding itenContainersUserBinding) {
            super(itenContainersUserBinding.getRoot());
            binding = itenContainersUserBinding;
        }

        void setUserData(User user) {
            if (user != null) {
                binding.textName.setText(user.name);
                binding.textEmail.setText(user.email);
                binding.imageProfile.setImageBitmap(getUserImage(user.image));
            }
        }

    }

    private Bitmap getUserImage(String encodedImage) {
        try {
            byte[] bytes = Base64.decode(encodedImage, Base64.DEFAULT);
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception, return a default image, or log an error message
            return null;
        }
    }

}
