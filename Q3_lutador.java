public class Q3_lutador {

    int energia, forca; static int golpe; String nome;

    public Q3_lutador(int energia, int forca, String nome) {

        this.energia = energia;
        this.forca = forca;
        this.nome = nome;
    }
    public void aplicarGolpe(Q3_lutador num1){
        golpe = this.forca;
        num1.reduzirEnergia();
    }
    public void reduzirEnergia(){
       this.energia -= golpe;
    }
}
