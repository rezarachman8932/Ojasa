package com.id.ojasa.models.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/28/15.
 */
public class LoginResponse {

    @SerializedName("message")
    LoginResponseMessage responseMessage;

    @SerializedName("data")
    LoginResponseData responseData;

    public LoginResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public LoginResponseData getResponseData() {
        return responseData;
    }

}
