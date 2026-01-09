package ContaBancaria;

public class Conta {
   private String titular ;
   private double saldo ;

     public Conta(String titular , double saldo){
          this.titular = titular;
          this.saldo = saldo;

         System.out.println("Nome titular" + titular);
         System.out.println("Saldo da conta:" + saldo);
     }

     public  void depositar ( double valor){
         saldo += valor;
     }

     public boolean sacar ( double valor){
        if(valor > 0 && valor <= saldo){
             saldo -= valor;
             return  true;
        }else {
             return false;
        }
     }

     public  double getSaldo (){
         return saldo;
     }

     public void exibirDados() {
         System.out.println("Nome do titular: " + titular );
         System.out.println("Saldo da conta: " + saldo);
     }
}
