public class Func_Math {
    public static void main(String[] args) {
        //cacular Raíz quadrada de um número (double)
        System.out.println(Math.sqrt(4));

        //Arredondamento de um número (double ou float)
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));

        //Tira o sinal netagivo do número (int, long, double ou float)
        System.out.println(Math.abs(-4.4));

        //Retorna o MAIOR número (int, long, double ou float)
        System.out.println(Math.max(1,2));

        //Retorna o MENOR número (int, long, double ou float)
        System.out.println(Math.min(1,2));

        //Retorna um valor de 0 até quase 1 (int, long, double ou float)
        for (int i = 0; i <5; i++) {
            System.out.println(Math.random());
        }

        //Retorna o valor de PI = 3.14
        System.out.println(Math.PI);

        //Retorna o valor de Euler = 2.71
        System.out.println(Math.E);








    }
}
