package Questao6;
import java.util.Scanner;

public class Meses {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do depósito mensal: ");
        double depositoMensal = teclado.nextDouble();

        System.out.println("Digite o montante desejado: ");
        double montanteDesejado = teclado.nextDouble();

        double saldo = 0;
        int meses = 0;

        while(saldo<montanteDesejado){
            saldo += depositoMensal;
            double juros = saldo*0.005;
            saldo+=juros;
            meses++;
        }
        System.out.println("Serão necessarios " + meses + " meses para acumular o montante desejado!");
    }
}
