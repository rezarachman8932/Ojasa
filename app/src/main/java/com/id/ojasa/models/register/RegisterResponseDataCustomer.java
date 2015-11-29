package com.id.ojasa.models.register;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class RegisterResponseDataCustomer {

    @SerializedName("id")
    int customerId;

    @SerializedName("email")
    String customerName;

    @SerializedName("first_name")
    String customerFirstName;

    @SerializedName("last_name")
    String customerLastName;

    @SerializedName("username")
    String customerUserName;

    @SerializedName("password")
    String customerPassword;

    @SerializedName("gender")
    String customerGender;

    @SerializedName("birthdate")
    String customerBirthDate;

    @SerializedName("address_id")
    String customerAddressId;

    @SerializedName("created_at")
    String customerCreatedAt;

    @SerializedName("updated_at")
    String customerUpdatedAt;

    @SerializedName("full_name")
    String customerFullName;

    @SerializedName("address")
    String customerAddresss;

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

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public String getCustomerBirthDate() {
        return customerBirthDate;
    }

    public String getCustomerAddressId() {
        return customerAddressId;
    }

    public String getCustomerCreatedAt() {
        return customerCreatedAt;
    }

    public String getCustomerUpdatedAt() {
        return customerUpdatedAt;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public String getCustomerAddresss() {
        return customerAddresss;
    }

    public String getCustomerAddressDetail() {
        return customerAddressDetail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

}
