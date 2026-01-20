package entities;

public class CurrencyConverter {

    public static double dollarReal(double dollarPrice, double amount) {
        return amount * dollarPrice * 1.06;
    }
}
