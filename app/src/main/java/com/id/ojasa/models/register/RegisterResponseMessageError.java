package com.id.ojasa.models.register;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class RegisterResponseMessageError {

    public List<String> getEmailMessageError() {
        return emailMessageError;
    }

    @SerializedName("email")
    public List<String> emailMessageError;

}
