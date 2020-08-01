public class ArraysMultidimensionais {

    public static void main(String[] args) {

        // Criação de Matriz com 4-linhas e 4-colunas
        //int[][] matriz = new int[4][4];

        // Criação de Matríz com 4-linhas e X-colunas
        int[][] matriz = new int[4][];

        matriz[0] = new int[5];
        matriz[1] = new int[8];
        matriz[2] = new int[3];
        matriz[3] = new int[10];

        // For para percorrer as linhas.
        for (int i = 0; i < matriz.length; i++) {
            // For para percorrer as colunas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");
        // Criação de Matriz já inicializando os valores
        // Matriz de 1-linha e 1-coluna.
        int mt[][] = {{1}, {2}};

        for (int x = 0; x < mt.length; x++) {
            for (int y = 0; y < mt[x].length; y++) {
                System.out.print(mt[x][y]);
            }

        }

    }
}
