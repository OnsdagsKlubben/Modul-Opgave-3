package org.dat18c.shipsandsails.models.world;

import org.dat18c.shipsandsails.enums.maps.MapSize;
import org.dat18c.shipsandsails.enums.world.Direction;
import org.dat18c.shipsandsails.models.Coordinate;

/**
 * Map
 */
public final class Map 
{    
    private int mapLength;
    private Tile[][] tiles;
    private Direction windDirection;

    public Map(MapSize mapSize) 
    {
        switch (mapSize) 
        {
            case SMALL:
                mapLength = 12;
                break;
            case NORMAL:
                mapLength = 24;
                break;
            case BIG:
                mapLength = 32;
                break;
            default:
                break;
        }

        initTiles();
    }

    /**
     * @return the tiles
     */
    public Tile[][] getTiles() 
    {
        return tiles;
    }

    private void initTiles()
    {
        tiles = new Tile[mapLength][mapLength];

        for (int x = 0; x < mapLength; x++) {
            for (int y = 0; y < mapLength; y++) 
            {
                tiles[x][y] = new Tile(new Coordinate(x, y));    
            }        
        }
    }

    public void changeWindDirection(Direction direction)
    {
        this.windDirection = direction;
    }
}