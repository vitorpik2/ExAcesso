package javaex10;

public class JavaEX10 {

    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 2022);
        Carro c2 = new Carro("Ford", "Modelo T", 1886); 

        c1.exibirDados();
        c2.exibirDados();

        c1.setAno(2020);
        
        c1.exibirDados();
    }

}
