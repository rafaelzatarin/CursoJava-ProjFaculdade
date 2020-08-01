public class Main {
    public static void main(String[] args) {
//        Funcionario func = new Funcionario();
//
//        func.dormir();
//
//        System.out.println(Nivel.JUNIOR);
//        System.out.println(NivelClass.JUNIOR);

        /** Exemplo de Polimorfismo
         * É quando pode assumir várias formas e tem comportamentos diferentes.
         * Tendo como ajuda a implementação de novas classes que utilizam um metodo abstrato exisente.
         */
        Pessoa p1 = new Funcionario();
        Pessoa p2 = new Esportista();

        polimorfismo(p1);
        polimorfismo(p2);
    }

    private static void polimorfismo(Pessoa p) {
        p.pagarImposto();
    }
}
