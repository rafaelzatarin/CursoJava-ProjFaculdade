import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class Exercicios3 {

    private void num1() {
        for (int n1 = 10; n1 <= 220; n1++) {
            System.out.println(n1);
        }
    }

    private void num2() {
        for (int n2 = 10; n2 <= 220; n2++) {
            if (n2 % 2 == 0) {
                System.out.println(n2);
            }
        }
    }

    private void num3() {
        float invIni = 100000;
        float juros = 0.08f;
        int anos = 0;
        while (invIni < 1000000) {
            invIni = invIni + (invIni * juros);
            anos++;
        }
        System.out.println("Vai levar " + anos + " anos.");
    }

    private String num4() {
        int anos = 0;
        for (float capital = 100000; capital < 1000000; anos++) {
            capital = capital + (capital * 0.08f);

            if (anos > 3) {
                capital = capital + 50000;
            }
        }
        return "Vai levar " + anos + " anos.";
    }

    private void num5() {
        String letras = "abc";
        String invert = "";
        int cont;
        for (cont = (letras.length() - 1); cont >= 0; cont--) {
            invert += letras.charAt(cont);
        }
        System.out.println("Usando FOR: " + invert);

        while (cont >= 0) {
            invert += letras.charAt(cont);
            cont--;
        }
        System.out.println("Usando WHILE: " + invert);
    }

    private long num6(int n6) {
        if (n6 == 0 || n6 == 1) {
            return 1;
        } else {
            long res;
            for (res = 1; n6 >= 1; n6--) {
                res = res * n6;
            }
            return res;
        }
    }

    private void num7(int vlr) {
        int i, j, cont = 1;

        for (i = 0; i < vlr; i++) {
            for (j = 0; j < cont; j++) {
                System.out.print("#");
            }
            cont++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercicios3 func = new Exercicios3();

        // Num 1
        System.out.println("Número 1:");
        func.num1();

        // Num 2
        System.out.println("\nNúmero 2:");
        func.num2();

        // Num 3
        System.out.println("\nNúmero 3:");
        func.num3();

        // Num 4
        System.out.println("\nNúmero 4:");
        System.out.println(func.num4());

        // Num 5
        System.out.println("\nNúmero 5:");
        func.num5();

        // Num 6
        System.out.println("\nNúmero 6:");
        System.out.println(func.num6(4));
        System.out.println(func.num6(1));

        // Num 7
        System.out.println("\nNúmero 7:");
        func.num7(6);
    }
}
