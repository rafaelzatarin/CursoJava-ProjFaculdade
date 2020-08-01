/**
 * Type     Bits
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Char     2
 * String   ?
 * Boolean  ?
 * **/

public class TiposDados {
    public static void main(String[] args) {
        // Números decimais
        Double d = 10.0;
        Float f = 100.5f;
        // Números inteiros
        Long l = 50l;
        Integer i = 10;
        Short s = 20;
        Byte b = 99;
        // Apresentação dos Valores Mínimos e Máximos Suportados pelas Variáveis
        System.out.println("Double Min: " + Double.MIN_VALUE + " - Double Max: " + Double.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE + " - Float Max: " + Float.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE + " - Long Max: " + Long.MAX_VALUE);
        System.out.println("Integer Min: " + Integer.MIN_VALUE + " - Integer Max: " + Integer.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE + " - Short Max: " + Short.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE + " - Byte Max: " + Byte.MAX_VALUE);

        String str = "Rafael Zatarin Andrade";
        Boolean boll = false;

        Character c = 'A';
        System.out.println("Character Min: " + Character.MIN_VALUE + " - Character Max: " + Character.MAX_VALUE);
    }
}
