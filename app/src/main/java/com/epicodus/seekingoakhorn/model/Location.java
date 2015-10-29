package com.epicodus.seekingoakhorn.model;

/**
 * Created by Guest on 10/28/15.
 */
public class Location {
    private String mTitle;
    private int mImage;
    private String mDescription;
    private Choice mNorth;
    private Choice mEast;
    private Choice mSouth;
    private Choice mWest;

    public Location(String title, int image, String description, Choice north, Choice east, Choice south, Choice west) {
        mTitle = title;
        mImage = image;
        mDescription = description;
        mNorth = north;
        mEast = east;
        mSouth = south;
        mWest = west;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Choice getNorth() {
        return mNorth;
    }

    public void setNorth(Choice north) {
        mNorth = north;
    }

    public Choice getEast() {
        return mEast;
    }

    public void setEast(Choice east) {
        mEast = east;
    }

    public Choice getSouth() {
        return mSouth;
    }

    public void setSouth(Choice south) {
        mSouth = south;
    }

    public Choice getWest() {
        return mWest;
    }

    public void setWest(Choice west) {
        mWest = west;
    }
}
