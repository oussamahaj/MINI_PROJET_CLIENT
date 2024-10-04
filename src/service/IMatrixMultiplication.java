package service;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMatrixMultiplication extends Remote {
	 // Multiplie une partie des matrices A et B
    int[][] multiplyPart(int[][] A, int[][] B, int startRow, int endRow) throws RemoteException;

	int[][] multiplyMatrices(int[][] a, int[][] b, int i) throws RemoteException;
    
}
