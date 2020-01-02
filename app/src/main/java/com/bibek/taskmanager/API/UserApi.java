package com.bibek.taskmanager.API;

import com.bibek.taskmanager.serverResponse.SignupResponse;

public interface UserApi {
    @POST("users/signup")
    Call<SignupResponse> checkUser(@Field("username, @Field("password") String Password)
    @Multipart
    @Post
}
