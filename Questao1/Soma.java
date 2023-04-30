package Questao1;
import java.util.Scanner;

public class Soma{



    public static void main(String[] args) {
        double soma = 0;
        String res;
        Scanner teclado = new Scanner(System.in);
        do{
            try {
                System.out.println("Digite um numero: ");
                double n = teclado.nextDouble();
                
                soma+=n;
                System.out.println("Deseja continuar S/N ? ");
                res = teclado.next();
            } catch(NumberFormatException e){

            }

        }while(res.equals("S") || res.equals("s"));
        for (String arg : args) {
            try {
                double valor = Double.parseDouble(arg);
                soma += valor;
            } catch (NumberFormatException e) {
                // Caso o argumento não possa ser convertido para double, ele é ignorado
            }
        }
        System.out.println("A soma de todos os numeros é : " + soma);
    
    }
    
}