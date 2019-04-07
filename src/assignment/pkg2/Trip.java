/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author USER
 */
    public abstract class Trip {
    private String destination;
    private Vechile transportation;
    public Trip(String destination,Vechile transportation){
        this.destination= destination;
        this.transportation = transportation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Vechile getTransportation() {
        return transportation;
    }

    public void setTransportation(Vechile transportation) {
        this.transportation = transportation;
    }
    
    
}
