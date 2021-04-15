package com.local.guia9;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.local.guia9.databinding.ItemDogBinding;
import com.squareup.picasso.Picasso;

public class DogViewHolder extends RecyclerView.ViewHolder {
    private ItemDogBinding itemDB;

    public DogViewHolder(View v){
        super(v);
        itemDB = ItemDogBinding.bind(v);
    }

    public void bind(String imgUrl){
        Picasso.get().load(imgUrl).into(itemDB.ivDog);
    }
}
