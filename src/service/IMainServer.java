package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMainServer extends Remote {
    int[][] multiplyAndRetrieve(int[][] A, int[][] B) throws RemoteException;
}
