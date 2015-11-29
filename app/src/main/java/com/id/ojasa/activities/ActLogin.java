package com.id.ojasa.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.id.ojasa.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by rezarachman8932 on 11/23/15.
 */
public class ActLogin extends AppCompatActivity {

    @Bind(R.id.button_login)
    Button loginButton;

    @Bind(R.id.input_email)
    EditText inputEmail;

    @Bind(R.id.input_password)
    EditText inputPassword;

    @Bind(R.id.text_forgot_password)
    TextView textForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);
        ButterKnife.bind(this);


    }

}
