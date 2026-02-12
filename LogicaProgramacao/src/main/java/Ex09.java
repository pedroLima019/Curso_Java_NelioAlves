import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < num; i++) {
            int valor = sc.nextInt();
            if (valor % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("IMPARES: " + contadorImpar );
        System.out.println( "PARES: " + contadorPar);
    }
}
