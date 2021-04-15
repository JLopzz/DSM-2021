package com.local.guia9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DogAdapter extends RecyclerView.Adapter<DogViewHolder> {
    private List<String> imgs;

    public DogAdapter(List<String> imgs){
        this.imgs = imgs;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_dog, parent, false);
        return new DogViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder hold, int pos){
        hold.bind(imgs.get(pos));
    }

    @Override
    public int getItemCount(){
        return imgs != null? imgs.size():0;
    }
}
