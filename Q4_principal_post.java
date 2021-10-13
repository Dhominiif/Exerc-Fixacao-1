public class Q4_principal_post {

    public static void main(String[] args){

        Q4_post n1 = new Q4_post("O formato da terra, é, na verdade, uma tartaruga. Estudem mais.", "https://www.youtube.com/watch?v=glcSYvO7EEk");

        n1.curtir();
        n1.curtir();
        n1.curtir();

        System.out.println("\nNumero de curtidas: "+n1.numeroCurtidas);

        n1.compartilhar();
        n1.compartilhar();

        System.out.println("\nNumero de compartilhamento: "+n1.numeroCompartilhamento);
    }
}
