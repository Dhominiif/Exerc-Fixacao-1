public class Q4_post {

    String text, link; int numeroCurtidas, numeroCompartilhamento;

    public Q4_post(String text, String link){

        this.text = text;
        this.link = link;
    }

    public void curtir(){

        this.numeroCurtidas-=-1;
    }

    public void compartilhar(){

        this.numeroCompartilhamento-=-1;
    }
}
