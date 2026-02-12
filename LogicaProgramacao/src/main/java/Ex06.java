public class Ex06 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 3, 7};
        int maior = arr[0];
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                segundoMaior = maior;
                maior = arr[i];
            } else if (arr[i] < maior && arr[i] > segundoMaior) {
                segundoMaior = arr[i];
            }
        }

        System.out.println("MAIOR: " + maior + " Segundo MAIOR: " + segundoMaior);
    }
}
