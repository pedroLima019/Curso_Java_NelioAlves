package entities;

public class Products {

     public String name;
     public double price;
     public int quantity;

     public double totalValueStock(){
          return price * quantity;
     }

     public void addProducts(int quantity){
            this.quantity += quantity;
     }

     public void removeProducts(int quantity){
          this.quantity -= quantity;
     }

     // toString: Converte o objeto para string
     public  String toString(){
       return "Produto name: "  + name +  " Preço do produto: " + String.format("%.2f" , price) + " Quantidade: " + quantity +
                 " Valor total do estoque: " + totalValueStock();
     }
}
