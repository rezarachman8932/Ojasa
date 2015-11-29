package com.id.ojasa.models.register;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class RegisterResponseData {

    public RegisterResponseDataCustomer getResponseDataCustomer() {
        return responseDataCustomer;
    }

    @SerializedName("customer")
    RegisterResponseDataCustomer responseDataCustomer;

}
