package org.dat18c.shipsandsails;

/**
 * GameManager
 */
public final class GameManager 
{
    private static GameManager instance = null;

    private GameManager()
    {
        
    }

    public static GameManager getInstance()
    {
        if (instance == null) 
        {
            instance = new GameManager();    
        }
        return instance;
    }

    public void initialize() 
    {

    }

    private void loop()
    {

    }
}