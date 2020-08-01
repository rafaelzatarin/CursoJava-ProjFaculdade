public abstract class Pessoa {

    private String nome;
    private int anoNasc;
//    private final float peso= 10f;

    public void comer(){}

    //final tem a função de não poder utilizar em outras classes.
    public final void dormir() {
        System.out.println("Estou dormindo. ");
    }

    /** Metodo abstrato
     *  Será definido nas outras classes.
     *  Quando um metodo da classe é abstrato e Classe também tem que ser definda como abstrata
     *  Um Class abstrata não pode se chamada como new Pessoa(); em outra classe.
     */
    public abstract void pagarImposto();

    public static String definicao() {
        return "Ser Humano";
    }

    public int getAnoNasc() { return anoNasc; }

    public void setAnoNasc(int anoNasc) { this.anoNasc = anoNasc; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

}
