public class Exercicios1 {
    private String helloWord(String str) {
        return "A palavra possuí " + str.length() + " caracteres";
    }

    private int somar( int n1, int n2) {
        return n1 + n2;
    }

    private float calc(float x, float y, float z) {
         return (((x + y) * x) / z);
    }

    public static void main(String[] args) {
        Exercicios1 funcs = new Exercicios1();

        System.out.println(funcs.helloWord("Olá mundão de meu Deus!!!!"));

        System.out.println(funcs.somar(10, 30));

        System.out.println(funcs.calc(12f,55f,4.5f));

    }
}
