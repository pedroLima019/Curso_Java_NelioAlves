public class Ex07 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 2, 4, 2};
        int maiorFrequencia = 0;
        int numeroMaisFrequente = 0;

        for (int i = 0; i < arr.length; i++) {
            int atual = arr[i];
            int contador = 0;

            for (int j = 0; j < arr.length; j++) {
                if (atual == arr[j]) {
                    contador++;

                }
            }
            if (contador > maiorFrequencia) {
                maiorFrequencia = contador;
                numeroMaisFrequente = atual;
            }

        }

        System.out.println("Mais frequente: " + numeroMaisFrequente + " Frequencia: " + maiorFrequencia);

    }
}
