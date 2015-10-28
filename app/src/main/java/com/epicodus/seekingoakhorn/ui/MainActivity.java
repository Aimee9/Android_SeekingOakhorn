package com.epicodus.seekingoakhorn.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.epicodus.seekingoakhorn.R;
import com.epicodus.seekingoakhorn.model.User;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private User mUser;
    private TextView mUserName;
    private Button mLogoutButton;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mPreferences = getApplicationContext().getSharedPreferences("SeekingOakhorn", Context.MODE_PRIVATE);
    mUserName = (TextView)findViewById(R.id.userNameText);
    mLogoutButton = (Button)findViewById(R.id.logoutButton);
    mStartButton = (Button) findViewById(R.id.newButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdventureActivity.class);
                startActivity(intent);
            }
        });



        mLogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("SeekingOakhorn", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.commit();
                finish();
            }
        });

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
