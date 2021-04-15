package com.local.guia9;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("{raza}/images")
    Call<ApiRes>getDogsByBreed(@Path("raza") String raza);
}
