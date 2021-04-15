package com.local.guia9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import androidx.appcompat.widget.SearchView;
import android.widget.Toast;

import com.local.guia9.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity  implements SearchView.OnQueryTextListener {

    ActivityMainBinding bind;
    DogAdapter dogAdapt;
    List<String> img = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        initRecyclerView();
        bind.searchDog.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
    }

    private void initRecyclerView() {
        dogAdapt = new DogAdapter(img);
        bind.listDogs.setLayoutManager(new LinearLayoutManager(this));
        bind.listDogs.setAdapter(dogAdapt);
    }

    private ApiService getApiService(){
        Retrofit retro = new Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        ApiService serv = retro.create(ApiService.class);
        return serv;
    }

    private void searchByName(String raza){
        final Call<ApiRes> batch = getApiService().getDogsByBreed(raza);

        batch.enqueue(new Callback<ApiRes>() {
            @Override
            public void onResponse(@Nullable Call<ApiRes> call, @Nullable Response<ApiRes> res) {
                if(res != null && res.body() != null){
                    List<String> resImg = res.body().getImg();
                    img.clear();
                    img.addAll(resImg);
                    dogAdapt.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(@Nullable Call<ApiRes> call, @Nullable Throwable t){
                if(t != null) showError();
            }
        });
    }

    private void showError() {
        Toast.makeText(this, "Ha ocurrido un Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onQueryTextSubmit(String query){
        if(!query.isEmpty()) searchByName(query.toLowerCase());
        return true;
    }

    @Override
    public boolean onQueryTextChange(String query){
        return true;
    }
}