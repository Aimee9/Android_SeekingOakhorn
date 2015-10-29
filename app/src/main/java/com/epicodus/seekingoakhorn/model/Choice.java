package com.epicodus.seekingoakhorn.model;

/**
 * Created by Guest on 10/28/15.
 */
public class Choice {
    private  int mNextLocation;

    public Choice(int nextLocation) {
        mNextLocation = nextLocation;
    }

    public int getNextLocation() {
        return mNextLocation;
    }

    public void setNextLocation(int nextLocation) {
        mNextLocation = nextLocation;
    }

}
