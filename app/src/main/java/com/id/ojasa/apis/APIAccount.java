package com.id.ojasa.apis;

import com.id.ojasa.models.login.LoginResponse;
import com.id.ojasa.models.register.RegisterResponse;
import com.id.ojasa.models.reset.ResetPasswordResponse;

import retrofit.Callback;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedString;

/**
 * Created by rezarachman8932 on 11/28/15.
 */

public interface APIAccount {

    @Multipart
    @POST("login.json")
    void login(@Part("email_username") TypedString userName,
               @Part("password") TypedString password,
               Callback<LoginResponse> responseCallback);

    @Multipart
    @POST("signup.json")
    void signUp(@Part("email") TypedString email,
                @Part("password") TypedString password,
                @Part("password_confirmation") TypedString passwordConfirmation,
                @Part("phone") TypedString phone,
                @Part("full_name") TypedString fullName,
                @Part("address") TypedString address,
                @Part("addressdetail") TypedString addressDetail,
                Callback<RegisterResponse> responseCallback);

    @Multipart
    @POST("reset.json")
    void forgotPassword(@Part("email") TypedString email,
                        Callback<ResetPasswordResponse> resetPasswordResponseCallback);

}
