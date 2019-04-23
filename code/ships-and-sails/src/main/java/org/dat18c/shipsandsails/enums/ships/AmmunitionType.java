package org.dat18c.shipsandsails.enums.ships;

/**
 * AmmunitionType
 */
public enum AmmunitionType 
{
    CANON_BALL(0),
    CHAIN_SHOT(1),
    GRAPE_SHOT(2);

    private final int id;

    AmmunitionType(int id) 
    {
        this.id = id;
    }
}