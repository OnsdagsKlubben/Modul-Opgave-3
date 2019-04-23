package org.dat18c.shipsandsails.communication;

import java.net.Socket;

/**
 * IConnection
 */
public interface IConnection 
{
    Socket getSocket();
    boolean tryClose();
}