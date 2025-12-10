import  java.util.Scanner;
public class Ex02 {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        int num = scanner.nextInt();

        if (num % 2 == 0 ){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
