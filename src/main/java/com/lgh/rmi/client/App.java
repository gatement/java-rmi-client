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

		String serverHost = System.getProperty("app.rmi.server.name", "localhost");
		int serverPort = Integer.parseInt(System.getProperty("app.rmi.server.port", "1099"));

        String name = "rmi.service.DemoService";

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
