package service;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            IMainServer mainServer = (IMainServer) Naming.lookup("rmi://localhost:1999/MainServer");

            // Matrices d'exemple
            int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            int[][] B = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            // Appel de la multiplication
            int[][] result = mainServer.multiplyAndRetrieve(A, B);

            // Affichage du résultat
            System.out.println("Résultat de la multiplication :");
            for (int[] row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
