import java.util.Locale;
import java.util.Scanner;

public class CalculadoraEstoqueSimples {
     public static  void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);

         System.out.println("Adicionando produto:");
         System.out.println("Nome do produto:");
         String nome = sc.next();
         System.out.println("Preço do produto:");
         double preco = sc.nextDouble();
         System.out.println("Quantidade estoque:");
         int estoque = sc.nextInt();

         System.out.println("Produto: " + nome + "|" + "Preço: " + preco + "|" + "Estoque: " + estoque);

         System.out.println("Quantos produtos deseja adicionar ?");

         int addEstoque = sc.nextInt();

         estoque += addEstoque;
         System.out.println("Produto: " + nome + "|" + "Preço: " + preco + "|" + "Estoque: " + estoque);

         System.out.println("Quantos produtos deseja remover ?");
         int removeEstoque = sc.nextInt();
         estoque -= removeEstoque;
         System.out.println("Produto: " + nome + "|" + "Preço: " + preco + "|" + "Estoque: " + estoque);

         double totalLucro = preco * estoque;
         System.out.println("Lucro total: " + totalLucro);

         sc.close();

     }
}
