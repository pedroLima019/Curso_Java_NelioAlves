import java.util.Scanner;

public class Exercicio01 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int num1 = 0 , num2 = 0 ;
          num1 = sc.nextInt();
          num2 = sc.nextInt();
          var soma = num1 + num2;
        System.out.println("SOMA: " + soma);

        sc.close();

    }
}
