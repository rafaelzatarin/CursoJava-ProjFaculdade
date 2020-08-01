import java.util.ArrayList;

public class IntroColecoes {
    public static void main(String[] args) {

        //Criação de Array fixo com 10 posições.
        //int[] arr = new int[10];

        //Criação de array sem a limitação de posições
        ArrayList arr =  new ArrayList();
        arr.add("Rafael");
        arr.add(1);
        arr.add("ZATA");
        arr.add(true);
        System.out.println(arr);

        //Apaga o elemento do Array presente no indice de posição 2.
        arr.remove(2);
        System.out.println(arr);

        //Verificar tamanho da lista;
        arr.size();
        //Verificar se a lista está vazia ou não True = Sim / False = Não
        arr.isEmpty();
        //Verificar se a lista contém o valor 3 na lista (True/False)
        arr.contains(3);
        //Limpar todos os elementos da lista
        arr.clear();

        //Após limpar o Array está sendo incluso novos elementos
        arr.add(13);
        arr.add(10);
        arr.add(1986);
        arr.add(2020);

        //Percorrendo os elementos do Arrya com lista utilizando For
        System.out.println("\nTeste 1");
        for (Object a : arr){
            System.out.println(a);
        }

        System.out.println("\nTeste 2");
        for (int i=0; i <arr.size() ;i++) {
            System.out.println(arr.get(i));
        }
    }
}
