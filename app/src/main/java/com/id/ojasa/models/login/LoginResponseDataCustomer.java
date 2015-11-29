package com.id.ojasa.models.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class LoginResponseDataCustomer {

    @SerializedName("id")
    int customerId;

    @SerializedName("email")
    String customerEmail;

    @SerializedName("full_name")
    String customerName;

    @SerializedName("address")
    String customerAddress;

    @SerializedName("addressdetail")
    String customerAddressDetail;

    @SerializedName("phone")
    String customerPhone;

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerAddressDetail() {
        return customerAddressDetail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

}
