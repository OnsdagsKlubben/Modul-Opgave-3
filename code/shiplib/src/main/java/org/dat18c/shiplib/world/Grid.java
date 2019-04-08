package org.dat18c.shiplib.world;




public class Grid
{
    Tile [][] grid;
    MapSize size = MapSize.BIG;

    public Map (MapSize size)
    {
        if (size == MapSize.BIG)
        {
            grid = new Tile[24][24];
        }
        else
        {
            grid = new Tile[12][12];
        }

    }
    
}




