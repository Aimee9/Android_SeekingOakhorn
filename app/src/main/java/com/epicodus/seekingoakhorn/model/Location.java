package com.epicodus.seekingoakhorn.model;

/**
 * Created by Guest on 10/28/15.
 */
public class Location {
    private String mTitle;
    private int mImage;
    private String mDescription;
    private Choice mChoice1;
    private Choice mChoice2;
    private Choice mChoice3;
    private Choice mChoice4;

    public Location(String title, int image, String description, Choice choice1, Choice choice2, Choice choice3, Choice choice4) {
        mTitle = title;
        mImage = image;
        mDescription = description;
        mChoice1 = choice1;
        mChoice2 = choice2;
        mChoice3 = choice3;
        mChoice4 = choice4;
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

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public Choice getChoice3() {
        return mChoice3;
    }

    public void setChoice3(Choice choice3) {
        mChoice3 = choice3;
    }

    public Choice getChoice4() {
        return mChoice4;
    }

    public void setChoice4(Choice choice4) {
        mChoice4 = choice4;
    }
}
