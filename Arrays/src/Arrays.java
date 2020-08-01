public class Arrays {

    private String temperatura( int dia) {
        //Criação de array fixo de somente 5 dias
        float tempMax[] = {17.4f, 20f, 21.7f, 22f, 18.5f};
        return "A temperatura do dia " + dia + " é de " + tempMax[dia - 1] + ".";
    }

    public static void main(String[] args) {

        // Definição/Criação de Arrays
        System.out.println(" >>> Criação de Array sem valores");
        float[] notas = new float[5];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = i * 2;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("\n >>> Criação de Array com valores");
        long numeros[] = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\n >>> Executando Função com Array e tratando erros");
        try {
            Arrays arr = new Arrays();
            System.out.println(arr.temperatura(3));
            System.out.println(arr.temperatura(20));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Não há dados para o dia passado");
        }
    }
}
