package org.dat18c.shipsandsails.utils.communication;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * This class implements client sockets, for the endpoint communication to the server.
 * {@code ServerConnection} is only used for establishing a connection to a server.
 * @author Frederik Lundbeck Jørgensen
 */
public final class ServerConnection 
{
    /**
     * A constant variable for the connection timeout, in Milliseconds.
     */
    public static final int CONNECTION_TIMEOUT = 5000; 

    private Socket clientSocket = null;

    private int port;
    private InetAddress address;

    public ServerConnection() 
    {
        clientSocket = new Socket();
    }

    /**
     * @return the connected socket object.
     */
    public Socket getClientSocket() 
    {
        if (clientSocket != null) 
        {
            return clientSocket;
        }
        return null;
    }

    /**
     * Tries to connect to the given ip address and port. Connection is stopped if time has exceeded the  
     * {@code CONNECTION_TIMEOUT} value in milliseconds.
     * @return a boolean on whether or not the connection was successful.
     */
    public boolean startConnection(InetAddress address, int port)
    {
        try 
        {
            clientSocket.connect(new InetSocketAddress(address, port), CONNECTION_TIMEOUT);

            if (clientSocket.isConnected()) 
            {
                this.address = address;
                this.port = port;
                return true;
            }
            return false;
        } 
        catch (IOException e) 
        {
           System.out.println(e.toString());
           return false;
        }
    }

    /**
     * Tries to close the connection nicely.
     */
    public boolean closeConnection()
    {
        try
        {
            clientSocket.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong trying to close the connection!");
            return false;
        }
    }

    @Override
    public String toString() 
    {
        return String.format("IpAddress: %s\nPort: %s", address.toString(), port);
    }
}