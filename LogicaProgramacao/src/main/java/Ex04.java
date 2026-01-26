public class Ex04 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 3, 7};
        int maior = arr[0]; // o maior é sempre o primeiro número do array



        for (int i = 0; i < arr.length; i++) {
            int atual = arr[i]; // atual =  número atual
            if (atual > maior) {
               maior = atual;
            }
        }

        System.out.println(maior);
    }
}

