package org.dat18c.shipsandsails;

import org.dat18c.shipsandsails.enums.ships.ShipType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShipsAndSailsApplication 
{
	public static void main(String[] args) 
	{
		ShipType type = ShipType.SOTL;

		String name = type.getShipTypeName();

		System.out.println(name);

		SpringApplication.run(ShipsAndSailsApplication.class, args);
	}

}
