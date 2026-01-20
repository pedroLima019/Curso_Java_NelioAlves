import entities.CurrencyConverter;
import entities.Product;

public class exercicio05 {
    public static void main(String[] args) {
        Product p1 = new Product("Tenis", 100, 10);

        p1.addProducts(30);
        p1.removeProducts(20);
        p1.increasePrice(50);


        double conversao = CurrencyConverter.dollarReal(20, 2);
        System.out.println("Valor convertido: " + conversao);

        System.out.println(p1);
    }
}
