package com.epicodus.seekingoakhorn.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.epicodus.seekingoakhorn.R;

import java.net.URI;
import java.util.List;

public class FinishActivity extends AppCompatActivity {

    private TextView mRobotAttackText;
    private TextView mBeginningText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        mRobotAttackText = (TextView)findViewById(R.id.robotAttackText);
        mBeginningText = (TextView)findViewById(R.id.beginningText);

        mRobotAttackText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("http://games.adultswim.com/robot-unicorn-attack-twitchy-online-game.html");
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, website);

                if (isIntentSafe(websiteIntent)) {
                    startActivity(websiteIntent);
                }
            }
        });

        mBeginningText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean isIntentSafe(Intent websiteIntent) {
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(websiteIntent, PackageManager.MATCH_DEFAULT_ONLY);
        return activities.size() > 0;
    }
}
