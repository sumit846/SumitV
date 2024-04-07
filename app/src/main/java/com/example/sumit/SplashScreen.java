package com.example.sumit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.sumit.activities.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    public static final String PREFERENCES = "prefKey";
    SharedPreferences sharedPreferences;
    public static final String IsLogin = "islogin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();
        sharedPreferences = getApplicationContext().getSharedPreferences(PREFERENCES,MODE_PRIVATE);
        boolean bol = sharedPreferences.getBoolean(IsLogin,false);

        new Handler().postDelayed(()->{
            if(bol) {
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                finish();
            }else{
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                finish();
            }
        },3000);
    }
}