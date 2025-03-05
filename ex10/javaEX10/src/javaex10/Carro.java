package javaex10;

public class Carro {

    private String marca;
    private String modelo;
    public int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); 
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            System.out.println("Algum carro esta com o ano invalido! defina como 1886 ou mais.");
            System.exit(0);
        }
    }

    public void exibirDados() {
        System.out.println("Carro: " + marca + " " + modelo + ", Ano: " + ano);
    }

}
