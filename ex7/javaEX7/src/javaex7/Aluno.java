package javaex7;

public class Aluno extends Pessoa {

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirIdade() {
        System.out.println("Idade do aluno: " + idade + " anos");
        
    }

}
