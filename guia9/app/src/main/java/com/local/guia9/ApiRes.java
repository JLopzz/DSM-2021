package com.local.guia9;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ApiRes {

    @SerializedName("status")
    private String status;

    private List<String> img;

    public String getStatus(){
        return status;
    }
    public List<String> getImg(){
        return img;
    }
    public void setImg(List<String> img){
        this.img = img;
    }
}
