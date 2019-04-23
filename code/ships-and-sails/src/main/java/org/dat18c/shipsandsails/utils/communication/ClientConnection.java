package org.dat18c.shipsandsails.utils.communication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public final class ClientConnection implements IConnection
{
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public ClientConnection(int port) 
    {
        try 
        {
            this.serverSocket = new ServerSocket(port);
        } 
        catch (IOException e) 
        {
			System.out.println(e.toString());
		}
    }

    /**
     * @return the clientSocket
     */
    public Socket getSocket() 
    {
        return clientSocket;
    }

    public void waitForClient()
    {
        try 
        {
            clientSocket = serverSocket.accept();
        } 
        catch (IOException e) 
        {
            System.out.println(e.toString());
        }
    }

    public boolean tryClose()
    {
        try 
        {
            clientSocket.close();
            serverSocket.close();
            return true;
        } 
        catch (IOException e) 
        {
            System.out.println(e.toString());
            return false;
		}
    }
}