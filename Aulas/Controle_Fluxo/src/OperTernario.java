public class OperTernario {
    private void maiorIdade(int idade) {
        // ? = Operador Ternário
        // (Expressão) ? true : false
        System.out.println((idade >= 18) ? "Maior de Idade" : "Menor de Idade");
    }
    public static void main(String[] args) {
        OperTernario func = new OperTernario();

        func.maiorIdade(18);
        func.maiorIdade(17);
        func.maiorIdade(20);

    }
}
