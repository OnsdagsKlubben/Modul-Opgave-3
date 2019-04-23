package org.dat18c.shipsandsails.enums.ships;

public enum ShipType
{
    BRIG(0),
    SOTL(1),
    MAW(2);

    private final int id;

    ShipType(int id)
    {
        this.id = id;
    }
}