public class SwitchCase {

    private void SalarioNivel(String cargo) {

        switch (cargo) {
            case "Junior": {
                System.out.println("Nível " + cargo + " - Seu salario é entre: R$1500,00 à R$3000,00");
                break;
            }
            case "Pleno": {
                System.out.println("Nível " + cargo + " - Seu salario é entre: R$3500,00 à R$5000,00");
                break;
            }
            case "Senior": {
                System.out.println("Nível " + cargo + " - Seu salário é entre: R$6500,00 à R$8000,00");
                break;
            }
            default: {
                System.out.println("Nível " + cargo + " - Salário não classificado - VOCÊ GANHA MUITO!!!!!");
            }
        }
    }

    public static void main(String[] args) {
        SwitchCase fun = new SwitchCase();

        fun.SalarioNivel("Pleno");
        fun.SalarioNivel("Especialista");
        fun.SalarioNivel("Junior");
        fun.SalarioNivel("Senior");
    }
}
