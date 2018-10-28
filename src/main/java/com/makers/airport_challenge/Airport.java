package com.makers.airport_challenge;

public class Airport {

    public String landPlane(Plane plane) {
        plane.land();
//        return "com.makers.airport_challenge.Plane has landed";
        return plane.getStatus();
    }
}
