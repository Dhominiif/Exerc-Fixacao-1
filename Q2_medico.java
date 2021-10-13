public class Q2_medico {

    int codigo; String nome, sexo, especialidade; Q2_endereco endereco;

    public Q2_medico(int cod, String nome, String sexo, String especialidade, Q2_endereco endereco){

        this.codigo = cod;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public String getEndereco(){
        return  "UF: "+this.endereco.uf+"\nCEP: "+this.endereco.cep+"\nCIDADE: "+this.endereco.cidade+"\nBAIRRO: "+this.endereco.bairro+"\nRUA: "+this.endereco.rua+"\nNUMERO: "+this.endereco.numero+"\nCOMPLEMENTO: "+this.endereco.complemento;
    }
}