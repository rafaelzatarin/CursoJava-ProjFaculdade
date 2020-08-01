import com.sun.jmx.snmp.SnmpOidTableSupport;

public class Exercicio4 {

    private void nomes() {
        String nomes[] = {"Natasha Alianovna Romanoff", "Rafael", "Stephen vicent Strange", "Anthony Edward Stark"};
        String max = nomes[0];
        int indice = 0;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > max.length())
                max = nomes[i];
        }
        System.out.println("O índice de maior NOME é: " + max.toUpperCase());
    }

    private float media(float notas[]) {
        if (notas == null || notas.length == 0)
            return 0;
        else {
            float soma = 0;
            int media = notas.length;
            for (int count = 0; count < media; count++) {
                soma += notas[count];
            }
            return soma / media;
        }
    }

    // Criado um array fora da função para guardar o valor do fatorial já calculado
    long[] fatorial = new long[10];
    private long fatorial(int n) {
        if (n == 0 || n == 1 || n > 10) {
            System.out.println("Retornar 1 quando cálculo do fatorial for de: 0, 1 ou maior 10.");
            return 1;
        }
        //Criado condição para verificar se o fatorial já foi calculado.
        //Sendo que se for diferente de 0 o mesmo já foi calculado.
        if (fatorial[n] != 0) {
            System.out.println("Cálculo evitado");
            return fatorial[n];
        }

        long resultado = 1;
        //variável criada para aguardar o valor do fatorial já calculado
        //assim fazendo a verificação acima antes de entrar no laço
        int nfator = n;
        while (n > 1) {
            resultado *= n;
            n--;
        }

        fatorial[nfator] = resultado;
        System.out.println("Cálculo realizado");

        return resultado;
    }

    public static void main(String[] args) {
        Exercicio4 func = new Exercicio4();

        System.out.println(" >>> Número 1:");
        func.nomes();

        System.out.println("\n >>> Número 2:");
        // Para poder utilziar as informações de um arrys na função foi necessário
        // gravar o mesmo em um vaiável.
        float notas1[] = {14f, 5.3f, 63.5f, 34f, 15f};
        float notas2[] = {};
        float notas3[] = null;
        System.out.println("A média calculada é: " + func.media(notas1));
        System.out.println("A média calculada é: " + func.media(notas2));
        System.out.println("A média calculada é: " + func.media(notas3));

        System.out.println("\n >>> Número 3:");
        func.fatorial(7);
        func.fatorial(11);
        func.fatorial(8);
        func.fatorial(7);
    }
}