public class Q3_luta {

    public static void main(String[] args){

        Q3_lutador Ryu = new Q3_lutador(100, 10, "Ryu");
        Q3_lutador Bison = new Q3_lutador(100, 12, "Bison");

        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);

        System.out.println("Energia do "+Bison.nome+": "+Bison.energia);

        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);

        System.out.println("Energia do "+Ryu.nome+": "+Ryu.energia);
    }
}
