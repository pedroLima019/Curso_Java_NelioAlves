import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite N números: ");
        int nums = sc.nextInt();

        int soma = 0;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= nums; i++) {
            int numAtual = sc.nextInt();

            soma += numAtual;

            if (numAtual > maior) {
                maior = numAtual;
            }

        }

        double media = soma / nums;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);

        sc.close();
    }
}
