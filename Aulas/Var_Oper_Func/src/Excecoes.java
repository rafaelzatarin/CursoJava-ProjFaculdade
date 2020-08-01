public class Excecoes {
    public static void main(String[] args) {

        // Com Try Catch é possível parametrizar que seja retornado
        // uma mensagem de erro ao invés de retornar erros durante
        // a execução do código.

        try {
            String str = "Curso de Java";
            str.charAt(200);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
        } catch (Exception e){
            System.out.println("Erro desconhecido!");
        } finally {
            System.out.println("Executei 1º Erro");
        }


        try {
            String s = null;
            System.out.println(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
        } catch (NullPointerException e){
            System.out.println("Registro nulo!");
        } finally {
            System.out.println("Executei 2º Erro");
        }

        try {
            String nome = "Rafael Zatarin";
            nome.charAt(200);
        } catch (Exception e){
            System.out.println("Erro desconhecido!");
        } finally {
            System.out.println("Executei 3º Erro");
        }

    }
}
