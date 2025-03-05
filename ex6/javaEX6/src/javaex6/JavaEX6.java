
package javaex6;


public class JavaEX6 {

  
    public static void main(String[] args) {
         Usuario u1 = new Usuario("admin", "12345");

       
        System.out.println(u1.autenticar("admin", "12345")); 

      
        System.out.println(u1.autenticar("admin", "senhaErrada")); 
        
    }
    
}
