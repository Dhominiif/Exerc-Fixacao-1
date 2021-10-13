public class Q5_aluno {

    String nome, cpf; Double nota1, nota2, nota3;

    public Q5_aluno(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public Double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3)/3;
    }
}
