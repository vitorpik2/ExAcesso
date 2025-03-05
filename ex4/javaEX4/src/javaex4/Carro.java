package javaex4;


public class Carro extends Veiculo{
    
   
    
     public Carro(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima; 
    }

    
    public void exibirVelocidadeMaxima() {
        System.out.println("Velocidade Maxima do Carro: " + velocidadeMaxima + " km/h");
    }
    
}
