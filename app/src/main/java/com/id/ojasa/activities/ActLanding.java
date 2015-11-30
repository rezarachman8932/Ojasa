package com.id.ojasa.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.id.ojasa.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActLanding extends AppCompatActivity {

    @Bind(R.id.button_email_login)
    Button emailLogin;

    @Bind(R.id.button_facebook_login)
    LinearLayout facebookLogin;

    @Bind(R.id.button_register)
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(ActLanding.this, "onCreate", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.act_landing);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_email_login, R.id.button_register, R.id.button_facebook_login})
    public void handleClick(View view) {
        switch (view.getId()) {
            case R.id.button_email_login:
                Toast.makeText(ActLanding.this, "Email", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_register:
                Toast.makeText(ActLanding.this, "Register", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_facebook_login:
                Toast.makeText(ActLanding.this, "Facebook", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(ActLanding.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(ActLanding.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(ActLanding.this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(ActLanding.this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(ActLanding.this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(ActLanding.this, "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }

}
