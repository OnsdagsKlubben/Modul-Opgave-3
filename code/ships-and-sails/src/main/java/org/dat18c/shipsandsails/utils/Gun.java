package org.dat18c.shipsandsails.utils;

public class Gun {

    int dice = new Dice;

    static void Crit(int dice, int currentHullLife)
    {
        if (dice == 1)
        {
            System.out.println("damn crit son");
            currentHullLife = currentHullLife/2;
            System.out.println(currentHullLife);
        }
        else if (dice == 2)
        {
            System.out.println("Semi crit son");
            currentHullLife = currentHullLife/3;
            System.out.println(currentHullLife);
        }
        else if (dice == 3)
        {
            System.out.println("bad crit");
            currentHullLife = currentHullLife/4;
            System.out.println(currentHullLife);
        }
    }
}

