public class Ex03 {

    public static void main(String[] args) {
        int numNegatives[] = {-2, 5, -1, 7, -3};
        int sum = 0;
        for (int i = 0; i < numNegatives.length; i++) {
            if (numNegatives[i] < 0) {
                sum += numNegatives[i];
            }
        }
        System.out.println("Soma dos números: " + sum);
    }
}
