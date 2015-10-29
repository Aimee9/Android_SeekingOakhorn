package com.epicodus.seekingoakhorn.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.seekingoakhorn.R;
import com.epicodus.seekingoakhorn.model.Location;
import com.epicodus.seekingoakhorn.model.LocationLibrary;

public class AdventureActivity extends AppCompatActivity {

    private LocationLibrary mLocationLibrary = new LocationLibrary();
    private  TextView mTitleText;
    private ImageView mImageView;
    private TextView mDescriptionText;

    private Button mNorthButton;
    private Button mEastButton;
    private Button mSouthButton;
    private Button mWestButton;
    private Location mCurrentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        mTitleText = (TextView)findViewById(R.id.titleText);
        mImageView = (ImageView)findViewById(R.id.mainImage);
        mDescriptionText = (TextView)findViewById(R.id.descriptionText);

        mNorthButton = (Button)findViewById(R.id.northButton);
        mEastButton = (Button)findViewById(R.id.eastButton);
        mSouthButton = (Button)findViewById(R.id.southButton);
        mWestButton = (Button)findViewById(R.id.westButton);

        loadLocation(0);
    }


    private void loadLocation(int choice) {
        mCurrentLocation = mLocationLibrary.getLocation(choice);


        mTitleText.setText(mCurrentLocation.getTitle());
        mImageView.setImageResource(mCurrentLocation.getImage());
        mDescriptionText.setText(mCurrentLocation.getDescription());

        mNorthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextLocation = mCurrentLocation.getNorth().getNextLocation();
                loadLocation(nextLocation);
            }
        });

        mEastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextLocation = mCurrentLocation.getEast().getNextLocation();
                loadLocation(nextLocation);
            }
        });

        mSouthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextLocation = mCurrentLocation.getSouth().getNextLocation();
                loadLocation(nextLocation);
            }
        });

        mWestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextLocation = mCurrentLocation.getWest().getNextLocation();
                loadLocation(nextLocation);
            }
        });

    }
}
