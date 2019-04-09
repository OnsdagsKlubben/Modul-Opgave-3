package org.dat18c.shipsandsails.world;

public class Coordinate 
{
    private int x;
    private int y;

    public Coordinate(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x coordinate
     */
    public int getX() 
    {
        return x;
    }
    /**
     * @return the y coordinate
     */
    public int getY() 
    {
        return y;
    }
    /**
     * @param x the x coordinate to set
     */
    public void setX(int x) 
    {
        this.x = x;
    }
    /**
     * @param y the y coordinate to set
     */
    public void setY(int y) 
    {
        this.y = y;
    }

    @Override
    public String toString() 
    {
        return String.format("(%s, %s)", x,y);
    }

    @Override
    public boolean equals(Object obj) 
    {
        try 
        {
            Coordinate o = (Coordinate)obj;
            return this.x == o.x && this.y == o.y;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }
}