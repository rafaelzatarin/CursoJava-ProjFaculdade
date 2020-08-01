public class Funcoes {
    /* >>> Teoria de Funções <<<
     * Função é uma parte do programa que possui responsabilidade
     * especifica e poder ser reusada quando necessário.
     * Estrutura da Função
         private = Somente visível e pode ser utilizado dentro da class que foi criada
         Tipo de retorno
         Nome da função
         Parametro da função que fica enrte parenteses

       Tipos de retorno:
         void: não possui retorno, executa o que contem em seu corpo e termina e execução
         Double, Float, Long, Integer, Short, Byte, Boolean, String e Tipos primitivos: pode executar
              seu corpo e fornecer uma resposta a seu chamador.
         Instâncias de Classes: é possível que uma função retorne um tipo de dado restante da instancia da classse

       Chamada de função:
         É realizada através do nome e parâmetros da função.
     */
    private void olaMundo() {
        System.out.println("Olá Mundão!!!!!");
    }

    private int soma(int n1, int n2) {
        return n1+n2;
    }

    public static void main(String[] args) {
        // Criando a chamada de Funções
        Funcoes func = new Funcoes();
        func.olaMundo();

        System.out.println(func.soma(10, 5));

        // Para ver as função já prontas no Java basta sobre ela e clicar "Ctrl+B"
        String str = "  Rafael Zatarin  ";

        //Verifica igualdade
        System.out.println(str.equals("teste"));
        //Verifica inicio do texto
        System.out.println(str.startsWith("Raf"));
        //Verifica fim do texto
        System.out.println(str.endsWith("Andrade"));
        //Inicia na terceira posíção
        System.out.println(str.substring(3));
        //Inicia na Terceira e Finaliza na Nona posição
        System.out.println(str.substring(3, 9));
        //Altera a informações passada no primeiro param para a informação presente no segundo param.
        System.out.println(str.replace("Zatarin", "Zata"));
        // Tranforma em Maiusculo
        System.out.println(str.toUpperCase());
        // Tranforma em Minisculo
        System.out.println(str.toLowerCase());
        //Retira o espaço no final da String
        System.out.println(str.trim());
        //Retortnar o numero de caracteres da string
        System.out.println(str.length());
    }
}
