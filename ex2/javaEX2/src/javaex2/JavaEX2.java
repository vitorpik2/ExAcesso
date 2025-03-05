
package javaex2;


public class JavaEX2 {

    
    public static void main(String[] args) {
          Produto p1 = new Produto("bolacha",2.54);        
        Produto p2 = new Produto("cerveja");
        //Produto p3 = new Produto();
        
        
        p1.Exibir();
        p1.setNome("Bolacha Maria");
        p1.setPreco(-2.53);
        p1.Exibir();
        
        p2.Exibir();
        
        
    }
    
}
