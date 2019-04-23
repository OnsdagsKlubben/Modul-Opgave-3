package org.dat18c.shipsandsails.utils.communication;

import java.net.Socket;

/**
 * IConnection
 */
public interface IConnection 
{
    Socket getSocket();
    boolean tryClose();
}