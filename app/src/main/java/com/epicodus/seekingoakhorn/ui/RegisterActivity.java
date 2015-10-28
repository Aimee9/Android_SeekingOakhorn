package com.epicodus.seekingoakhorn.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.seekingoakhorn.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText mNameText;
    private Button mBeginButton;
    private SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mNameText = (EditText)findViewById(R.id.nameText);
        mBeginButton = (Button)findViewById(R.id.beginButton);
        mPreferences = getApplicationContext().getSharedPreferences("SeekingOakhorn", Context.MODE_PRIVATE);

        mBeginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameText.getText().toString();
                SharedPreferences.Editor editor = mPreferences.edit();
                editor.putString("username", name);
                editor.commit();
                mNameText.getText().clear();
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
