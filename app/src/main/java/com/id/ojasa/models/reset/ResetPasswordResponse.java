package com.id.ojasa.models.reset;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rezarachman8932 on 11/29/15.
 */
public class ResetPasswordResponse {

    public ResetPasswordMessage getResetPasswordMessage() {
        return resetPasswordMessage;
    }

    @SerializedName("message")
    ResetPasswordMessage resetPasswordMessage;

}
