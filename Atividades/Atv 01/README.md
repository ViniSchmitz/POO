# Atv 01

Nesse exercicio foi utilizado q classe scanner para obter a entrada dos usuarios
Dentro do loop for, solicitamos ao usuário que digite cada argumento um por um e os adicionamos ao array de argumentos. Após o loop de entrada ser concluido, criamos uma instancia da classe SomaArgumentos e chamamos seu método somarArgumentos, passando o array de argumentos. No qual imprimimos o resultado na saída padrão. Dessa forma, o programa solicitara que o usuario digite os valores de entrada e, em seguida, calculará a soma dos argumentos, ignorando os argumentos inválidos.

~~~java
import java.util.Scanner;

public class Soma {
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
~~~