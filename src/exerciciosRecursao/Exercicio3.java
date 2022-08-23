package exerciciosRecursao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hackerrank
 */
public class Exercicio3 {

    private static int superDigit(String n, int k) {
        String realN = n;
        //logica para concatenar o numero k vezes na primeira vez que chamarmos o metodo
        if(k != 0){
            realN = "";
            for (int i = 0; i < k; i++) {
                realN += n;
            }
        }
//        System.out.println(realN);
        //condicao de parada - se o nosso realN tiver apenas um digito a gente retorna
        if (realN.length() == 1) {
            return Integer.parseInt(n);
        }
        //logica para extrair o superDigit
        //primeiro transformamos nossa string em uma array de char, cada char representando um digito
        char[] digits = realN.toCharArray();
        int superDigit = 0;
        //para cada digito da nossa array nos somamos
        for (int i = 0; i < digits.length; i++) {
            superDigit += Integer.parseInt(String.valueOf(digits[i]));
        }
//        System.out.println("Super digit: " + superDigit);
        //transformamos nosso super digit de volta em String para passarmos como parametro
        String superDigitStr = String.valueOf(superDigit);
        //passamos o valor 0 pois nao queremos mais concatenar o valor k vezes
        return superDigit(superDigitStr, 0);
    }

    public static void main(String[] args) {

        System.out.println(superDigit("9875", 4));
    }
}
