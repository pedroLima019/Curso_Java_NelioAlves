import entities.ConnectManager;

public class exercicio06 {
    public static void main(String[] args) {
        ConnectManager.setMaxConnection(2);
        ConnectManager c1 = new ConnectManager();

        System.out.println(c1.connect());
        System.out.println(c1.connect());
        System.out.println(c1.connect());

    }
}
