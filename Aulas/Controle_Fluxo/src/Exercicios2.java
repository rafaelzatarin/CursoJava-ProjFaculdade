import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Exercicios2 {
    // Num 1
    private void tempo(boolean chuva, double temp) {
        if (chuva == true && temp <= 0) {
            System.out.println("Neve");
        } else if (chuva == true && temp > 0) {
            System.out.println("Chuva");
        } else {
            System.out.println("Clima limpo e sem chuvas");
        }
    }

    // Num 2
    private float totCompra(int qtd) {
        if (qtd <= 0) {
            return qtd * 0;
        } else if (qtd >= 5) {
            return qtd * 2;
        } else {
            return qtd * 2.5f;
        }
    }

    // Num 3
    private String agenda(String dia) {

        String str;
        switch (dia) {
            case "Segunda" : {
                str = "-feira -> Aula de faluta e futebol à noite";
                break;
            }
            case "Terça" : {
                str =  "-feira -> Estudos de programção e leitura";
                break;
            }
            case "Quarta" : {
                str =  "-feira -> Inglês e conversação";
                break;
            }
            case "Quinta" : {
                str =  "-feira -> Trabalho de Conclusão de Curso - TCC";
                break;
            }
            case "Sexta" : {
                str =  "-feira -> Livre";
                break;
            }
            default: {
                str = " -> Sem Dados";
                break;
            }
        }
        return dia + str;
    }

    // Num 4
    private void email(String nome, String sobrenome) {
        if (nome == "" || sobrenome == "") {
            System.out.println("ERRO - Dados obrigatórios!");
        } else {
            System.out.println((nome.charAt(0) + "." + sobrenome + "@yest.com").toLowerCase());
        }
    }

    public static void main(String[] args) {
        Exercicios2 funcs = new Exercicios2();
        // Num 1
        System.out.println("Número 1: ");
        funcs.tempo(true, -1.22);
        funcs.tempo(true, 5.45);
        funcs.tempo(false, 0);
        // Num 2
        System.out.println("\nNúmero 2: ");
        System.out.println("Custo é R$" + funcs.totCompra(-1));
        System.out.println("Custo é R$" + funcs.totCompra(0));
        System.out.println("Custo é R$" + funcs.totCompra(3));
        System.out.println("Custo é R$" + funcs.totCompra(4));
        System.out.println("Custo é R$" + funcs.totCompra(5));
        System.out.println("Custo é R$" + funcs.totCompra(6));
        // Num 3
        System.out.println("\nNúmero 3: ");
        System.out.println(funcs.agenda("Segunda"));
        System.out.println(funcs.agenda("Terça"));
        System.out.println(funcs.agenda("Quarta"));
        System.out.println(funcs.agenda("Quinta"));
        System.out.println(funcs.agenda("Sexta"));
        System.out.println(funcs.agenda("Sabado"));
        System.out.println(funcs.agenda("Domingo"));
        // Num 4
        System.out.println("\nNúmero 4: ");
        funcs.email("Rafael", "Zatarin");
        funcs.email("","");
        funcs.email("","Andrade");
        funcs.email("Zata","");
        funcs.email("Karla","Rocelli");
    }
}
