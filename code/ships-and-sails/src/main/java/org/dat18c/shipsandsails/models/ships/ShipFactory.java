package org.dat18c.shipsandsails.models.ships;

import org.dat18c.shipsandsails.enums.ships.ShipType;
import org.dat18c.shipsandsails.enums.world.Direction;
import org.dat18c.shipsandsails.models.world.Coordinate;

/**
 * ShipFactory
 */
public class ShipFactory 
{
    public Ship createShip(String name, String nationality, Coordinate coordinate, Direction direction, ShipType type)
    {
        switch (type) {
            case BRIG:
                return new Ship(2, 25, 30, 60, 1, name, nationality, ShipType.BRIG, coordinate, direction);

            case SOTL:
                 return new Ship(5, 60, 60, 160, 1, name, nationality, ShipType.SOTL, coordinate, direction);
                
            case MAW:
                return new Ship(4, 140, 80, 340, 1, name, nationality, ShipType.MAW, coordinate, direction);

            default:
                return null;
        }
    }
}