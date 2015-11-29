package com.id.ojasa.models.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/28/15.
 */
public class LoginResponseMessage {

    @SerializedName("success")
    String messageSuccess;

    @SerializedName("error")
    String messageError;

    public String getMessageError() {
        return messageError;
    }

    public String getMessageSuccess() {
        return messageSuccess;
    }

}
