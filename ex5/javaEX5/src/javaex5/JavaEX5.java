package javaex5;

public class JavaEX5 {

    public static void main(String[] args) {

        Funcionario F1 = new Funcionario("Carlos Silva", 3500.00);

        F1.exibirDados();

        F1.setNome("Ana Souza");
        F1.setSalario(4500.00);

        System.out.println("");

        System.out.println("Dados Atualizados:");
        F1.exibirDados();

    }

}
