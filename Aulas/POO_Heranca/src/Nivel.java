public enum Nivel {
    JUNIOR(1), PLENO(3), SENIOR(7);

    private int valor;
    Nivel(int id){
        this.valor = id;
    }

    public void changeId() { this.valor = 10; }

    public int getId() {
        return valor;
    }
}
