public class Exercicio5 {

    public static void main(String[] args) {

        float matriz[][] = {{8.8f, 9, 7.6f, 4}, {8.9f, 9.7f, 9.4f, 8.9f}, {10, 10, 9, 9}, {4.7f, 9.9f, 9.2f, 8.9f}};

        int i, j;
        float somar = 0, media=0;
        for(i = 0; i < matriz.length; i++) {
            for(j = 0; j < matriz[i].length; j++) {
                somar += matriz[i][j];
                media = matriz.length * matriz[i].length;
            }
        }
        System.out.println("a média da turma é: " + somar/media);
    }
}
