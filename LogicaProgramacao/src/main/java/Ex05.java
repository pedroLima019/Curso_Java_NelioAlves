public class Ex05 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 8};
        int menor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int atual = arr[i];
            if (atual < menor) {
                menor = atual;
            }
        }

        System.out.println(menor);
    }
}
