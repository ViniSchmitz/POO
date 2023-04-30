package Questao1;
import java.util.Scanner;

public class Soma{  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de argumentos: ");
        int numArgs = teclado.nextInt();
        String[] argsArray = new String[numArgs];
        for (int i = 0; i < numArgs; i++) {
            System.out.print("Digite o argumento " + (i + 1) + ": ");
            argsArray[i] = teclado.next();
        }
        teclado.close();

        SomaArgumentos somaArgs = new SomaArgumentos();
        double soma = somaArgs.somarArgumentos(argsArray);
        System.out.println("A soma dos argumentos é: " + soma);
    }
}

class SomaArgumentos {
    public double somarArgumentos(String[] args) {
        double soma = 0.0;
        for (String arg : args) {
            try {
                double valor = Double.parseDouble(arg);
                soma += valor;
            } catch (NumberFormatException e) {
                // argumento inválido, ignorar
            }
        }
        return soma;
    }
}


