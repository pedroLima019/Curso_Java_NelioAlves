import ContaBancaria.Conta;

public class ContaBanco {
    public static void main(String[] args) {

        Conta conta = new Conta("Pedro", 2500);

        conta.exibirDados();
        conta.depositar(3000);
        conta.exibirDados();

        if (conta.sacar(500)) {
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

        conta.exibirDados();
    }
}

