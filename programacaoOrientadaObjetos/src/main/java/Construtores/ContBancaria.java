package Construtores;

public class ContBancaria {
    public double saldo;
    public int numero;
    public String titular;

    public ContBancaria() {
        this.saldo = 0.0;
    }

    public ContBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public ContBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
}
