

public class Ex02 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 7, 9, 10, 12};
        int countNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 3 == 0) {
                countNumbers++;
            }

        }
        System.out.println(countNumbers);
    }
}

