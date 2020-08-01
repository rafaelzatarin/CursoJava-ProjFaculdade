public class Funcionario extends Pessoa {
    //Capacidade de sobreescrever um método já definido na classe PAI.mas é sim    @Override
//    public void dormir() {
//        super.dormir();
//        System.out.println("Trabalhei 8 horas.");
//    }

//    private void trabalhar() {
//        System.out.println("Trabalhei 8 horas");
//    }

    @Override
    public void pagarImposto() {
        System.out.println("Paguei 10% do salário.");
    }

}
