package exerciciosRecursao;

/**
 * Algoritmo recursivo para inverter uma string. Recebe a string retorna
 * a string invertida.
 */
public class Exercicio2 {
    /**
     * Andre -> erdnA
     * Step 1: ndre + A -> substring(1) + charAt(0)
     * Step 2: dre + n + A
     * Step 3: re + d + n + A
     * Step 4: e + r + d + n + A
     */
    private static String reverteStringRecursivo(String s){
        if(s == null || s.length()<=1){
            return s;
        }
        return reverteStringRecursivo(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "Andre";
        System.out.println(reverteStringRecursivo(s));
    }
}
