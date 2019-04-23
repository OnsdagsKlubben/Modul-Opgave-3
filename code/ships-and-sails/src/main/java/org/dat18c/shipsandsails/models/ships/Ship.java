package org.dat18c.shipsandsails.models.ships;

import org.dat18c.shipsandsails.enums.ships.AmmunitionType;
import org.dat18c.shipsandsails.enums.ships.ShipType;
import org.dat18c.shipsandsails.enums.world.Direction;
import org.dat18c.shipsandsails.models.Coordinate;

/**
 * @author Frederik Lundbeck Jørgensen
 */
public class Ship 
{
    private int speed_max;
    private int speed_current;
    private int hull_max;
    private int hull_current;
    private int sail_max;
    private int sail_current;
    private int sailors_max;
    private int sailors_current;
    private int load_time;
    private String name;
    private String nationality;
    private ShipType type;
    private Coordinate coordinate;
    private Direction direction;
    private AmmunitionType currentAmmunitionType = AmmunitionType.CANON_BALL;
    
    public Ship(int speed_max, int hull_max, int sail_max, int sailors_max, int load_time, String name, String nationality, ShipType type, Coordinate coordinate, Direction direction) 
    {
        this.speed_max = speed_max;
        this.hull_max = hull_max;
        this.hull_current = hull_max;
        this.sail_max = sail_max;
        this.sail_current = sail_max;
        this.sailors_max = sailors_max;
        this.sail_current = sailors_current;
        this.load_time = load_time;
        this.name = name;
        this.nationality = nationality;
        this.type = type;
        this.coordinate = coordinate;
        this.direction = direction;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the speed_current
     */
    public int getSpeed_current() {
        return speed_current;
    }

    /**
     * @return the speed_max
     */
    public int getSpeed_max() {
        return speed_max;
    }

    /**
     * @return the hull_current
     */
    public int getHull_current() {
        return hull_current;
    }

    /**
     * @return the hull_max
     */
    public int getHull_max() {
        return hull_max;
    }

    /**
     * @return the sail_current
     */
    public int getSail_current() {
        return sail_current;
    }

    /**
     * @return the sail_max
     */
    public int getSail_max() {
        return sail_max;
    }

    /**
     * @return the sailors_current
     */
    public int getSailors_current() {
        return sailors_current;
    }

    /**
     * @return the sailors_max
     */
    public int getSailors_max() {
        return sailors_max;
    }

    /**
     * @return the type
     */
    public ShipType getType() {
        return type;
    }

    /**
     * @return the load_time
     */
    public int getLoad_time() {
        return load_time;
    }

    /**
     * @return the coordinate
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @return the currentAmmunitionType
     */
    public AmmunitionType getCurrentAmmunitionType() {
        return currentAmmunitionType;
    }
    
    @Override
    public String toString() 
    {
        return String.format("Name: %s, Nationality: %s, Coordinate: %s", name, nationality, coordinate);
    }

    @Override
    public boolean equals(Object obj) 
    {
        try 
        {
            Ship ship_obj = (Ship)obj;
            return ship_obj.name == this.name && ship_obj.nationality == this.nationality;
        } 
        catch (ClassCastException e) 
        {
            System.out.println(e.toString());
            return false;
        }
    }
}