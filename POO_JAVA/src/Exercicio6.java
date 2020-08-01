package IVOrientacaoObjetos.Objetos.Exercicios;

/*
Exercício.
Considere a classe abaixo. É possível reescrevê-la de maneira a melhorar o entendimento e manutenção?
Considere assuntos como construtor, encapsulamento, uso de funções e tratamento de exceções.
Há alguma validação a mais que poderia ser incluída?
*/
//CaixaAutomatico
public class Exercicio6 {

    private float saldo = 50000;
    private float saquedia = 0;

    private float getSaldo() {
        return saldo;
    }

    public float getSaquedia() {
        return this.saquedia;
    }

    private void saque(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Não é possível sacar um valor zero ou negativo.");
        }

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Efetudo Saque de R$" + valor);
            saquedia += valor;
        } else
            throw new Exception("Saldo insuficiente em caixa");
    }

    private void recarga(float valorRecarga) throws Exception{
        if (valorRecarga <= 0) {
            throw new Exception("Não é possível recarregar um valor zero ou negativo.");
        }

        saldo += valorRecarga;
        System.out.println("Realizado recarga de R$" + valorRecarga);
    }


    public static void main(String[] args) {
        Exercicio6 caixa = new Exercicio6();

        try {
            // Primeiro cliente vai fazer um saque
            caixa.saque(100);
            // Segundo cliente vai fazer um saque
            caixa.saque(3000);
            // Depois de dois saques, melhor repor o dinheiro
            caixa.recarga(1000);
            // Mais um cliente vai fazer um saque
            caixa.saque(1000000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}