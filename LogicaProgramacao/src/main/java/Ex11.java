import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        double divider = 0.0;

        System.out.println("Digite o primeiro número: ");
        int firstNum = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int secondNum = sc.nextInt();

        System.out.println("Digite uma operação: + . - , * , /");
        String operation = sc.next();


        if (operation.equals("+")) {
            soma = firstNum + secondNum;
        } else if (operation.equals("-")) {
            soma = firstNum - secondNum;
        } else if (operation.equals("*")) {
            soma = firstNum * secondNum;
        } else if (operation.equals("/")) {
            divider = firstNum / secondNum;
            if (divider == 0) {
                System.out.println("Não tem divisão por zero !");
            }
        }

        System.out.println("Resultado: " + soma);

    }
}
