package com.example.m3work34;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPerson extends RecyclerView.Adapter<PersonViewHolder> {
    private final ArrayList<String> namePersonContact;
    private final ArrayList<Integer> imageIcon;

    public AdapterPerson(ArrayList<String> namePersonContact, ArrayList<Integer> imageIcon) {
        this.namePersonContact = namePersonContact;
        this.imageIcon = imageIcon;
    }
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder_people, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.onBind(namePersonContact.get(position), imageIcon.get(position));
    }

    @Override
    public int getItemCount() {
        return namePersonContact.size();
    }
}
