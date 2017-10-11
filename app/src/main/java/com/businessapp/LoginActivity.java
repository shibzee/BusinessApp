package com.businessapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.sirvar.robin.RobinActivity;
import com.sirvar.robin.Theme;

public class LoginActivity extends RobinActivity{
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DO NOT call setContentView();

        //
        // Set title for each screen
        setLoginTitle("Sign in to Robin");
        setSignupTitle("Welcome to Robin");
        setForgotPasswordTitle("Forgot Password");

        // Set logo for screens
        setImage(getResources().getDrawable(R.mipmap.ic_launcher));

        // Use custom font across all views
        setFont(Typeface.createFromAsset(getAssets(), "Montserrat-Medium.ttf"));

        // Choose theme (default is LIGHT)
        setTheme(Theme.LIGHT);

        //Firebase Auth Instance
    }

    @Override
    protected void onLogin(String email, String password) {

    }

    @Override
    protected void onSignup(String name, String email, String password) {

    }

    @Override
    protected void onForgotPassword(String email) {

    }

    @Override
    protected void onGoogleLogin() {

    }

    @Override
    protected void onFacebookLogin() {

    }
}
