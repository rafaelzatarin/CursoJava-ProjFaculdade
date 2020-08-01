public class If_Else {
    //Função Maior de idade
    private void maiorIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }

    //Função calcula Bonus
    private void bonus(int anosEmp) {
        /**Lógica
         * 1 - 200
         * 2 a 3 - 500
         * 4 a 5 - 1000
         * > 5 - 2000
         * */
        if (anosEmp <= 1) {
            System.out.println("Você terá R$200,00 de BÔNUS!!!");
        } else if (anosEmp >= 2 && anosEmp <= 3) {
            System.out.println("Você terá R$500,00 de BÔNUS!!!");
        } else if (anosEmp >= 4 && anosEmp <= 5) {
            System.out.println("Você terá R$1000,00 de BÔNUS!!!");
        } else {
            System.out.println("Você terá R$2000,00 de BÔNUS!!!");
        }
    }

    private boolean maiordeIdade(int idade) {
        return idade >= 18;
    }
    public static void main(String[] args) {
        If_Else fun = new If_Else();
        fun.maiorIdade(10);
        fun.maiorIdade(20);

        if (fun.maiordeIdade(30)) {
            System.out.println("Verdade - Maior de Idade");
        } else {
            System.out.println("Mentira - Menor de Idade");
        }

        fun.bonus(0);
        fun.bonus(1);
        fun.bonus(2);
        fun.bonus(3);
        fun.bonus(4);
        fun.bonus(5);
        fun.bonus(6);
        fun.bonus(15);


    }
}
