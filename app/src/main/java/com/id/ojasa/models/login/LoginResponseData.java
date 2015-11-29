package com.id.ojasa.models.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/28/15.
 */
public class LoginResponseData {

    public LoginResponseDataCustomer getDataCustomer() {
        return dataCustomer;
    }

    @SerializedName("customer")
    LoginResponseDataCustomer dataCustomer;

}
