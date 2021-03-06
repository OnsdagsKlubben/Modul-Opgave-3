package org.dat18c.shipsandsails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShipsAndSailsApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(ShipsAndSailsApplication.class, args);
		GameManager gm = GameManager.getInstance();
		gm.initialize();
	}
}
