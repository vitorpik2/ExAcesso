
package javaex3;


public class JavaEX3 {

   
    public static void main(String[] args) {
       
        
          ContaBancaria conta = new ContaBancaria("Joao Silva", 1000.00);

        
        conta.exibirDados();

        
        conta.depositar(500.00);
        conta.sacar(300.00);
        conta.sacar(1500.00); 

        System.out.println("");
        
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
    
}
