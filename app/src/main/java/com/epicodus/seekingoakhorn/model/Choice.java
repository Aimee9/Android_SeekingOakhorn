package com.epicodus.seekingoakhorn.model;

/**
 * Created by Guest on 10/28/15.
 */
public class Choice {
    private  int mNextPage;

    public Choice(int nextPage) {
        mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

}
