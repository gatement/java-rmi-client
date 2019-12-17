package com.lgh.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DemoService extends Remote {
	String sayHello() throws RemoteException;
	double add(double a, double b) throws RemoteException;
	double subtract(double a, double b) throws RemoteException;
}
