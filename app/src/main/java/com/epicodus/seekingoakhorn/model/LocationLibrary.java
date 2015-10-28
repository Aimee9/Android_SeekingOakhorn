package com.epicodus.seekingoakhorn.model;

import com.epicodus.seekingoakhorn.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/28/15.
 */
public class LocationLibrary {
    private Location[]  mLocations;

    public LocationLibrary() {
        mLocations =new Location[11];



        mLocations[0] = new Location(
                "The MickleWood Forest",
                R.drawable.creatures,
                "During your wanderings you picked up rumours of a poor beast trapped in the nearby woods.  Being the kindhearted adventurer, you decide to investigate and are pointed towards the nearby forest.  After some distracted meandering you remember your mission and find yourself in the middle of the woods.  Where to next?",
                new Choice(1),
                new Choice(2),
                new Choice(3),
                new Choice(4)

        );

    }
}
