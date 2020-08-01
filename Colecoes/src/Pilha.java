import java.util.Stack;

//LIPO - last in first out

public class Pilha {
    public static void main(String[] args) {

        Stack pilha = new Stack();

        pilha.push(123);
        pilha.push("TESTE");
        pilha.push("Rafael");
        //Topo = ultimo item incluso na pilha
        //Adiciona no topo remove no topo = nesta caso remove "Rafael"
        System.out.println(pilha.pop());
        //Verificar o item do topo da lista
        System.out.println(pilha.peek());
        //

    }
}
