package org.dat18c.shipsandsails.models.world;

import org.dat18c.shipsandsails.models.world.Coordinate;

/**
 * Tile
 */
public class Tile 
{
    private Coordinate coordinate;

    public Tile(Coordinate coordinate) 
    {
        this.coordinate = coordinate;
    }

    /**
     * @return the coordinate
     */
    public Coordinate getCoordinate() 
    {
        return coordinate;
    }
}