package entities;

public class Mensagem {
    String texto;
    int prioridade;

    public Mensagem() {
        texto = "Mensagem vazia";
        prioridade = 0;
    }

    public Mensagem(String texto) {
        this.texto = texto;
        this.prioridade = 1;
    }

    public Mensagem(String texto, int prioridade) {
        this.texto = texto;
        this.prioridade = prioridade;
    }

    public void mostrarMesagem() {
        System.out.println(this.texto);
    }

    public void mostrarMensagem(boolean detalhado) {
        if (detalhado) {
            System.out.println(this.texto + " / prioridade / " + this.prioridade);
        } else {
            System.out.println(this.texto);
        }
    }
}
