package com.id.ojasa.models.register;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class RegisterResponseMessage {

    public String getMessageSuccess() {
        return messageSuccess;
    }

    public String getMessageError() {
        return messageError;
    }

    public RegisterResponseMessageError getResponseMessageError() {
        return responseMessageError;
    }

    @SerializedName("success")
    String messageSuccess;

    @SerializedName("error")
    String messageError;

    @SerializedName("errors")
    RegisterResponseMessageError responseMessageError;

}
