package com.epicodus.seekingoakhorn.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.epicodus.seekingoakhorn.R;
import com.epicodus.seekingoakhorn.model.User;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private User mUser;
    private TextView mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mPreferences = getApplicationContext().getSharedPreferences("SeekingOakhorn", Context.MODE_PRIVATE);
    mUserName = (TextView)findViewById(R.id.userNameText);


        if (!isRegistered()) {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }

    private boolean isRegistered() {
        String username = mPreferences.getString("username", null);
        if(username == null) {
            return false;
        } else {
            setUser(username);
            return true;
        }
    }

    private void setUser(String username) {
        User user = User.find(username);
        if(user !=null) {
            mUser = user;
        } else {
            mUser = new User(username);
            mUserName.setText(username);
            mUser.save();
        }
    }


}
