package org.dat18c.shipsandsails.utils.communication;

import java.io.IOException;
import java.net.ServerSocket;

public final class ClientConnection 
{
    private ServerSocket serverSocket = null;
    private int port;

    public ClientConnection(int port) 
    {
        this.port = port;
    }

    /**
     * @return the serverSocket
     */
    public ServerSocket getServerSocket() 
    {
        if (serverSocket != null) 
        {
            return serverSocket;
        }
        return null;
    }

    public void waitForClientConnection()
    {
        try 
        {
            serverSocket = new ServerSocket(); //Can throw when opening the socket!  
        } 
        catch (IOException e) 
        {
            System.out.println(e.toString());
        }
    }

    public void closeConnection()
    {
        try
        {
            serverSocket.close();
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }

}