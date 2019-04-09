package org.dat18c.shipsandsails.enums.ships;

public enum ShipType
{
    BRIG("Brigade"),
    SOTL("Ship of the line"),
    MAW("Man at war");

    private final String name;

    ShipType(String name)
    {
        this.name = name;
    }

    public String getShipTypeName()
    {
        return this.name;
    }
}