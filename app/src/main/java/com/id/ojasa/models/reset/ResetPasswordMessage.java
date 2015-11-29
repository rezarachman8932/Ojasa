package com.id.ojasa.models.reset;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class ResetPasswordMessage {

    @SerializedName("success")
    String resetPasswordMessage;

    @SerializedName("error")
    String resetPasswordError;

    public String getResetPasswordError() {
        return resetPasswordError;
    }

    public String getResetPasswordMessage() {
        return resetPasswordMessage;
    }

}
