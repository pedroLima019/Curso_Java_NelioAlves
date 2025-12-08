import java.util.Scanner;
public class Exercicio02 {
    public static  void  main (String[] args){
        Scanner  sc = new Scanner(System.in);
         double circle ;
         circle = sc.nextDouble();
         double calcCircle = Math.PI * Math.pow( circle , 2);
        System.out.println("A=" + calcCircle);
         sc.close();
    }
}
