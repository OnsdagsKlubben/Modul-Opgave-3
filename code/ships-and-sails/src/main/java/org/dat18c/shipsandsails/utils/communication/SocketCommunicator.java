package org.dat18c.shipsandsails.utils.communication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * SocketCommunicator
 */
public final class SocketCommunicator 
{
    private DataInputStream dis;
    private DataOutputStream dos;

    public SocketCommunicator(IConnection connection) 
    {
        try 
        {
			this.dis = new DataInputStream(connection.getSocket().getInputStream());
            this.dos = new DataOutputStream(connection.getSocket().getOutputStream());
        } 
        catch (IOException e) 
        {
			System.out.println(e.toString());
		}
    }

    public void write(String msg)
    {
        try 
        {
			dos.writeUTF(msg);
            dos.flush();
        } 
        catch (IOException e) 
        {
			System.out.println(e.toString());
		}
    }

    public String read()
    {
        try 
        {
            return dis.readUTF();
        } 
        catch (IOException e) 
        {
            System.out.println(e.toString());
            return null;
        }
    }
}