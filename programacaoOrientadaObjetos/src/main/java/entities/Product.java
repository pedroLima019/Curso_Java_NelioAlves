package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    public void removeProducts(int amount) {
        if (quantity > 0 && amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Quantidade tem que ser maior que zero");
        }
    }

    public void increasePrice(double percentage) {
        if (percentage > 0) {
            price += price * percentage / 100;
        }
    }


    @Override
    public String toString() {
        return "Name: " + name +
                "\nPreço: " + price +
                "\nQuantidade: " + quantity +
                "\nTotal em estoque: " + totalValueInStock();
    }

}
