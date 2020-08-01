public class Strings {
    public static void main(String[] args) {
        String nome = "Rafael",
                sobrenome = "Zatarin";
        Integer idade = 33;

        System.out.println("Primeiro caracter: " + nome.charAt(0));
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);

        Double d = 45520.1423151;
        System.out.println(d);
        String strD = String.valueOf(d);
        System.out.println("Double convertido em String: " + strD);

        Float f = 210f;
        System.out.println(f);
        System.out.println("Float convertido em String: " + String.valueOf(f));
    }
}
