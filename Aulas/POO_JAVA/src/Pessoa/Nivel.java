package Pessoa;

public enum Nivel {
    JUNIOR(1), PLENO(3), SENIOR(7);

    private int valor;
    Nivel(int id){
        this.valor = id;
    }

    public int getId() {
        return valor;
    }
}
