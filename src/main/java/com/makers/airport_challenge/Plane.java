package com.makers.airport_challenge;

public class Plane {

    private String status;

    public void land() {
        this.status = "Plane has landed";
    }

    public String getStatus(){
        return this.status;
    }
}
