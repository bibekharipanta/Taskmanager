package com.bibek.taskmanager.url;

public class Url {
    public static final String base_url = "http://192.168.1.11:3000";
    public static String token = "Bearer";
    public static String imagePath = base_url + "uploads/"\ ;

    public static Retrofit getInstance(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }



}
