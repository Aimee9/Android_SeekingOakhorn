package com.epicodus.seekingoakhorn.model;

import com.epicodus.seekingoakhorn.R;

/**
 * Created by Guest on 10/28/15.
 */
public class LocationLibrary {
    private Location[]  mLocations;

    public LocationLibrary() {
        mLocations =new Location[12];



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
                new Choice(1),
                new Choice(0),
                new Choice(7),
                new Choice(1));

        mLocations[2] = new Location(
                "Roar! A Firebreathing Dragon!",
                R.drawable.dragon,
                "You need water to stop his fire.  Then you can get a scale.",
                new Choice(2),
                new Choice(2),
                new Choice(2),
                new Choice(0));

        mLocations[3] = new Location(
                "Spooky Woods",
                R.drawable.spooky,
                "You get a creepy feeling about this place.  Move on quickly.",
                new Choice(3),
                new Choice(10),
                new Choice(0),
                new Choice(9));

        mLocations[4] = new Location(
                "Crossroads",
                R.drawable.crossroads,
                "So many choices",
                new Choice(0),
                new Choice(5),
                new Choice(6),
                new Choice(7));

        mLocations[5] = new Location(
                "Dry Well",
                R.drawable.well,
                "You got a bucket!  Too bad there is no water here to fill it.",
                new Choice(5),
                new Choice(5),
                new Choice(5),
                new Choice(4));

        mLocations[6] = new Location(
                "Unicorn",
                R.drawable.caged_unicorn,
                "The poor beast you have been seeking...a unicorn caged and locked up!  You need to get a key to let her out.",
                new Choice(4),
                new Choice(6),
                new Choice(6),
                new Choice(6));

        mLocations[7] = new Location(
                "Gnome!",
                R.drawable.gnome,
                "Whoops!  You surprise a gnome and he runs away.  In his haste he dropped a bar of lead.  Lucky for you.",
                new Choice(1),
                new Choice(4),
                new Choice(7),
                new Choice(8));

        mLocations[8] = new Location(
                "Edge of the lake",
                R.drawable.boat,
                "There is a boat.  Surely it will lead you somewhere good.",
                new Choice(9),
                new Choice(7),
                new Choice(8),
                new Choice(8));

        mLocations[9] = new Location(
                "Lake",
                R.drawable.lake,
                "What a beautiful view!  And now you can fill your bucket.",
                new Choice(9),
                new Choice(3),
                new Choice(9),
                new Choice(9));

        mLocations[10] = new Location(
                "Cave",
                R.drawable.cave,
                "Hmm...what could be inside?  Only one way to find out!",
                new Choice(10),
                new Choice(11),
                new Choice(10),
                new Choice(3));

        mLocations[11] = new Location(
                "Wizard",
                R.drawable.wizard,
                "You find a wizard intent on his studies.  He looks up when you walk in and knows immediately what you need.  He tells you to bring him a dragon scale and lead and he can make a golden key for you.",
                new Choice(11),
                new Choice(11),
                new Choice(11),
                new Choice(10));
    }

    public  Location getLocation(int locationNumber) {
        return mLocations[locationNumber];
    }
}
