
import  java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        int num = sc.nextInt();

        if (num < 0 ){
            System.out.println("negativo");
        }else {
            System.out.println("Positivo");
        }
        sc.close();
    }
}
