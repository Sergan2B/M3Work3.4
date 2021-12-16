package com.example.m3work34;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    private TextView namePersonContact;
    private ImageView imageView;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.buttonImage);
        namePersonContact = itemView.findViewById(R.id.buttonText);
    }

    public void onBind(String nameContact, Integer imageIcon) {
        imageView.setImageResource(imageIcon);
        namePersonContact.setText(nameContact);
    }
}
