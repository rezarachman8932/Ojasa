package com.id.ojasa.models.register;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class RegisterResponse {

    public RegisterResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public RegisterResponseData getResponseData() {
        return responseData;
    }

    @SerializedName("message")
    RegisterResponseMessage responseMessage;

    @SerializedName("data")
    RegisterResponseData responseData;

}
