package org.dat18c.shipsandsails.models;

import org.dat18c.shipsandsails.enums.ships.ShipType;
import org.dat18c.shipsandsails.utils.Coordinate;

public class Ship 
{
    private int id;   
    private int maxHull;
    private int currentHull;
    private int maxSailors;
    private int currentSailors;
    private int maxSails;
    private int currentSails;
    private int maxSpeed;
    private int currentSpeed;
    private ShipType type;
    private String nationality;
    private Coordinate coordinate;
    
    public Ship(int id, ShipType type, String nationality) 
    {
        
    }
    
}