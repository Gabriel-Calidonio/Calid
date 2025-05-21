import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Random rnd = new Random();

                int[] numerosUsuario = new int[6];
                int[] numerosSorteados = new int[6];
                int acertos = 0;

                // Entrada dos números do usuário
                System.out.println("Digite 6 números entre 1 e 60:");

                for (int i = 0; i < 6; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numerosUsuario[i] = scanner.nextInt();
                }

                // Sorteio dos números
                System.out.println("\nNúmeros sorteados:");
                for (int i = 0; i < 6; i++) {
                    numerosSorteados[i] = rnd.nextInt(60) + 1;
                    System.out.print(numerosSorteados[i] + " ");
                }

                // Comparação dos números
                for (int numUsuario : numerosUsuario) {
                    for (int numSorteado : numerosSorteados) {
                        if (numUsuario == numSorteado) {
                            acertos++;
                            break;
                        }
                    }
                }

                System.out.println("\n\nVocê acertou " + acertos + " número(s).");

                scanner.close();
            }
        }



