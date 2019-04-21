package org.dat18c.shipsandsails.utils;

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
     * @return the x
     */
    public int getX() 
    {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(int x) 
    {
        this.x = x;
    }
    /**
     * @return the y
     */
    public int getY() 
    {
        return y;
    }
    /**
     * @param y the y to set
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
            System.out.println(e.toString());
            return false;        
        }    
    }
}