package entities;

public class ConnectManager {
    private static int maxConnections;
    private static int activeConnections;

    public static void setMaxConnection(int max) {
        if (max < 1) {
            System.out.println("As conexões tem que ser a cima de 1 !!");
            return;
        }

        maxConnections = max;
    }

    public boolean connect() {

        if (activeConnections < maxConnections) {
            activeConnections++;
            return true;

        }
        return false;


    }

    public void disconnect() {
        if (activeConnections > 0) {
            activeConnections--;
        }

    }


}
