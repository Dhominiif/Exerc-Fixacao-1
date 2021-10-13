public class Q5_SUAP {

    public static void main(String[] args){

        double media;
        Q5_aluno n1 = new Q5_aluno("Dhomini Andrade dos Santos", "094.353.995-17");

        n1.nota1 = 5.00;
        n1.nota2 = 10.00;
        n1.nota3 = 5.00;

        media = n1.calcularMedia();

        System.out.printf("\nMedia: %.2f", media);

        n1.nota2 = 5.00;

       media = n1.calcularMedia();

        System.out.printf("\nMedia: %.2f", media);
    }
}
