import entities.Mensagem;

public class ContrutoresSobrecargas {
    public static void main(String[] args) {
        Mensagem m1 = new Mensagem();
        Mensagem m2 = new Mensagem("Salve");
        Mensagem m3 = new Mensagem("erro", 5);

        m1.mostrarMesagem();
        m2.mostrarMensagem(true);
        m3.mostrarMensagem(false);

    }
}
