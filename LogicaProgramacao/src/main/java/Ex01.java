

public class Ex01 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 3, 7};

        int maior = arr[0];
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int atual = arr[i];
            if (atual > maior) {
                segundoMaior = maior;
                maior = atual;
            } else if (atual < maior && atual > segundoMaior) {
                segundoMaior = atual;
            }
        }
        System.out.println(segundoMaior);
    }
}

