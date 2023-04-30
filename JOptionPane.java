package questao3;
import java.util.Scanner;
public class JOptionPane {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota da prova 1: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a nota da prova 2: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho: ");
        float notaTrabalho = teclado.nextFloat();
        float media = (nota1 +nota2 + notaTrabalho)/3;
        System.out.println("A media é: " + media);
    
    }
}

