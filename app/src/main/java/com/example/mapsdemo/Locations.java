package com.example.mapsdemo;

import android.location.Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Locations {

    public static List<Locations.Location> locationArrayList = Arrays.asList(
            new Locations.Location(33.7629, -84.3927, "Coca-Cola"),
            new Locations.Location(33.7634, -84.3951, "Aquarium"),
            new Locations.Location(33.7341, -84.3723, "Aquarium")
            );



    public static class Location {
        private double lattitude;
        private double longitude;
        private String name;

        public void setLattitude(double lattitude) {
            this.lattitude = lattitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location(double lattitude, double longitude, String name) {
            this.lattitude = lattitude;
            this.longitude = longitude;
            this.name = name;
        }

        public double getLattitude() {
            return lattitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public String getName() {
            return name;
        }
    }


}
