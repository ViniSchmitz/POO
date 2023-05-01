# Atv 02
Nesse exercicio foi usuado a biblioteca scanner, onde peço numeros interios para serem alocados
nas variaveis b e c, e logo em seguida guardo o produto das 2 na variavel a e depois printei o resultado e o aviso!+

~~~java
import java.util.Scanner;

public class FolhaDePagamento{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe um numero inteiro: ");
        int b = teclado.nextInt();
        System.out.print("informe um numero inteiro: ");
        int c = teclado.nextInt();
        float a = b*c;
        System.out.println(a);
        System.out.println("O programa executa um calculo de exemplo de folha de pagamento.");


    }    
}

~~~~