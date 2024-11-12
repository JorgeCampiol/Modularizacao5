import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int termos = lerNumeroDeTermos(scanner);
        int[] sequencia = gerarSequenciaFibonacci(termos);
        mostrarSequencia(sequencia);

        scanner.close();
    }

    private static int lerNumeroDeTermos(Scanner scanner) {
        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        return scanner.nextInt();
    }

    private static int[] gerarSequenciaFibonacci(int termos) {
        int[] sequencia = new int[termos];
        if (termos > 0) sequencia[0] = 0;
        if (termos > 1) sequencia[1] = 1;

        for (int i = 2; i < termos; i++) {
            sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
        }

        return sequencia;
    }

    private static void mostrarSequencia(int[] sequencia) {
        System.out.print("Sequência de Fibonacci: ");
        for (int numero : sequencia) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
