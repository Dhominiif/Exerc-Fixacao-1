public class Q2_clinica_medico {

    public static void main(String[] args) {

        Q2_endereco end1 = new Q2_endereco("12", "4850000", "Rua Roberto Santos", "Rua do 'prédio'", "Centro", "Euclides da Cunha", "BA");

        Q2_medico med1 = new Q2_medico(1, "José Alberto Miranda", "Masculino", "Pneumologista", end1);

        System.out.println("\n\n-----------Dados do médico-----------");
        System.out.println("Codigo: " + med1.codigo);
        System.out.println("Nome: " + med1.nome);
        System.out.println("Sexo: " + med1.sexo);
        System.out.println("Especialidade: " + med1.especialidade);
        System.out.println("\nEndereco:\n"+med1.getEndereco());

        end1.numero = "11";
        end1.cep = "4852000";
        end1.rua = "Rua Almirante José";
        end1.complemento = "Rua do 'zé'";
        end1.bairro = "Núcleo-II";
        end1.cidade = "São paulo";
        end1.uf = "SP";

        med1.codigo = 2;
        med1.nome = "Fernanda Andrade dos Santos";
        med1.sexo = "Feminino";
        med1.especialidade = "Cardiologista";

        System.out.println("\n\n-----------Dados do médico-----------");
        System.out.println("Codigo: " + med1.codigo);
        System.out.println("Nome: " + med1.nome);
        System.out.println("Sexo: " + med1.sexo);
        System.out.println("Especialidade: " + med1.especialidade);
        System.out.println("\nEndereco:\n"+med1.getEndereco());
    }
}
