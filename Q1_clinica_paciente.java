public class Q1_clinica_paciente {

    public static void main(String[] args) {

        Q1_Paciente n1 = new Q1_Paciente(1, "Dhomini Andrade dos Santos", "26/02/2004", "Masculino", "Padrão", "nenhuma", "O+");

        System.out.println("\nCodigo: " + n1.codigo);
        System.out.println("Nome: " + n1.nome);
        System.out.println("Data de nascimento: " + n1.dataNascimento);
        System.out.println("Sexo: " + n1.sexo);
        System.out.println("Plano de saúde: " + n1.planoSaude);
        System.out.println("Alergia: " + n1.alergia);
        System.out.println("Tipo Sanguíneo: " + n1.tipoSanguineo + "\n");

        n1.codigo = n1.codigo + 1;
        n1.nome = "Joselina Batista de Andrade";
        n1.dataNascimento = "26/09/1980";
        n1.sexo = "Feminino";
        n1.alergia = "Nenhuma";
        n1.planoSaude = "Plus";
        n1.tipoSanguineo = "O-";

        System.out.println("\nCodigo: " + n1.codigo);
        System.out.println("Nome: " + n1.nome);
        System.out.println("Data de nascimento: " + n1.dataNascimento);
        System.out.println("Sexo: " + n1.sexo);
        System.out.println("Plano de saúde: " + n1.planoSaude);
        System.out.println("Alergia: " + n1.alergia);
        System.out.println("Tipo Sanguíneo: " + n1.tipoSanguineo + "\n");


    }
}
