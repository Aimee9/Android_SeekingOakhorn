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
                "After some distracted meandering you remember your mission and find yourself in the middle of the woods.  Where to next?",
                new Choice(3),
                new Choice(2),
                new Choice(4),
                new Choice(1));

        mLocations[1] = new Location(
                "A Shrubbery!!",
                R.drawable.shrubbery,
                "Good to know this is here.  You never know when one might come in handy.",
                new Choice(0),
                new Choice(0),
                new Choice(5),
                new Choice(0));

        mLocations[2] = new Location(
                "Roar! A Firebreathing Dragon!",
                R.drawable.dragon,
                "You need water to stop his fire.  Then you can get his spit.",
                new Choice(0),
                new Choice(0),
                new Choice(0),
                new Choice(0));

        mLocations[3] = new Location(
                "Spooky Woods",
                R.drawable.spooky,
                "You get a creepy feeling about this place.  Move on quickly.",
                new Choice(0),
                new Choice(10),
                new Choice(0),
                new Choice(9));
    }

    public  Location getLocation(int locationNumber) {
        return mLocations[locationNumber];
    }
}
