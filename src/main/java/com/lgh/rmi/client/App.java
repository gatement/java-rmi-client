package com.lgh.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.lgh.rmi.server.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException, NotBoundException
    {
        System.out.println( "RMI Client started!" );

        String name = "rmi.service.DemoService";
        String serverHost = "vmcentos";
        int serverPort = 1099;

        Registry registry = LocateRegistry.getRegistry(serverHost, serverPort);
        DemoService service = (DemoService) registry.lookup(name);

        if (service != null)
        {
			System.out.println( "Got Service." );
        }

        System.out.println(service.sayHello());
        System.out.println(service.add(1.2, 2.5)); // 3.7
        System.out.println(service.subtract(8.2, 7.9)); // 0.3
    }
}
