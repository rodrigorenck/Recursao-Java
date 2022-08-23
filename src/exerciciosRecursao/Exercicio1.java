package exerciciosRecursao;

/**
 * Métodos que recebe um inteiro N maior que zero e devolve o
 * somatório desse N (N + N-1 + N-2+...)
 */
public class Exercicio1 {

    private static int somatorioRecursivo(int n){
        if(n == 0) return 0;
        return somatorioRecursivo(n-1) + n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(somatorioRecursivo(n));
    }
}
