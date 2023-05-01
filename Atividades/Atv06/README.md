# Atv06
Nessa atividade pedi as entradas ao usuario primeiramente o deposito mensal e logo em seguida o montante desejado no final dos meses, em seguida criei a variavel saldo recebendo zero no começo
e meses tambem recebendo 0, onde em seguida é feito um while que enquanto o saldo for menor que o montante desejado criara um laço de repetição em que o saldo recebe ele mais o deposito mensal
para que toda vez que adicione ja some com oque ja tinha, tambem é calculado os juros recebidos
que tambem soma com oque ja tinha, e por ultimo um contador de meses que foi necessario ate alcançar o valor desejado
e em seguida o print com os valores.

~~~java
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
~~~