
package javaex2;


public class Produto {
    
       private String nome;
    private double preco;

   
    //public produto(){}
    
    
    
    public Produto(String nome) {

        this.nome = nome;

    }

    public Produto(String nome,double preco ) {

        this.nome = nome;
        this.preco = preco;
    }
    
    public void Exibir(){
        System.out.println("nome: " + nome);
        System.out.println("Preco: " + preco);
    }

    
   
    public String getNome(){
        return this.nome;
        
    }
    
    
    public void setNome(String nome ){
        this.nome = nome;
    }
    
    
    
    
    
    public double getPreco(){
        return this.preco;
        
    }
    
    
    public void setPreco(double preco){
        this.preco = preco;
    
        if(preco < 0){
           this.preco = 0;
            System.out.println("erro");
            
            System.exit(0);
        }
    
    }
    
}
