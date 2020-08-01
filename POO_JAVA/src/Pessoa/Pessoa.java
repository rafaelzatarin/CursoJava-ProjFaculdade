package Pessoa;

public class Pessoa {

    private String nome;
    private int anoNasc;
    private Nivel nivel;
    public static int contador =0;

    public Pessoa() {
        contador++;
    }

    public static String definicao() {
        return "Ser Humano";
    }

    public int getAnoNasc() { return anoNasc; }

    public void setAnoNasc(int anoNasc) { this.anoNasc = anoNasc; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Nivel getNivel() { return nivel; }

    public void setNivel(Nivel nivel) { this.nivel = nivel; }
}
