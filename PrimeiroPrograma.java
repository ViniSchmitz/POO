import java.util.Scanner;

public class PrimeiroPrograma{
    public static void main(String[] args) {
        // Primeira aula de daodos primitivos
        Scanner teclado = new Scanner(System.in);
        // String nome = teclado.nextLine();
        // Float nota = teclado.nextFloat();
        // int idade = teclado.nextInt();
        // System.out.format("A nota de %s é  %.2f  \n", nome, nota);
       // segunda aula de operadores Aritmeticos 
        //int n1 = 3;
        //    int n2 = 5;
        //    float m = n1+n2/2;
        //    System.out.println("A media e igual a: "+m);
        // Terceira aula operadores logicos e relacionais 
        // operador ternario 
        // maior = n1>n2?n1:n2;
        // quando a exoressia n1>n2 depois da ? fica em n1 se não, for falso ficara em n2;
        // maaior = (n1>n2)?n1+n2:n1-n2
        // . equals verifica se o conteudo do objeto é igual ao outro
        // (nome1.equals(nome3))?"igual":"Diferente"
        // operadores logicos |&&-e| ||-ou | ^- xou ou exclusivo | !-não|
        // quarta aula estrura condicionais
        // condição simples
        // float n1 = teclado.nextFloat();
        // float n2 = teclado.nextFloat();
        // float media = (n1+n2)/2;
        // if (media>9) {
        //     System.out.println("Parabens cuzao");
        // }
        // condição composta
        // System.out.println("Digite o ano que nasceu: ");
        // int nasc = teclado.nextInt();
        // int idade = 2023 - nasc;
        // if(idade>=18) {
            // System.out.println("Maior de idade");
        // } else{
            // System.out.println("Menor de idade");
        // }
        // parte 2
        // Condições Composta encadeada 
        // System.out.println("Digite seu ano de nascimento: ");
        // int nasc = teclado.nextInt();
        // int idade = 2023 - nasc;
        // if(idade<16){
        //     System.out.println("Não vota");
        // } else{
        //     if((idade>=16 && idade<18) || (idade>70)){
        //         System.out.println("Voto Opcional");
        //     }else{
        //         System.out.println("Voto Obrigatorio");
        //     }
        // }
        // da para usar else if no mesmo coiso como elif
        // Condição de multipla escolha 
        // System.out.println("Quantas pernas tem? ");
        // int pernas = teclado.nextInt();
        // String tipo;
        // System.out.println("Isso é um(a) ");
        // // swtch não pega de intervalos e não pega numeros reais
        // switch (pernas) {
        //     case 1:
        //         tipo = "Saci";
        //         break;
        //     case 2:
        //         tipo = "Bipede";
        //         break;
        //     case 3:
        //         tipo = "Tripe";
        //         break;
        //     case 4:
        //         tipo = "Quadrupede";
        //         break;
        //     case 6:
        //         tipo = "Aranha";
        //         break;
        //     default:
        //         tipo = "ET";
        //         break;

        // }
        // System.out.println(tipo);

        // estrutura de repetições
        // estrutura de while
        // int cc = 0;
        // while(cc<4){
        //     System.out.println("Cambalhota" + (cc+1));
        //     cc++;
        // }
        // Mudando o fluxo de um laço

        // int cc = 0;
        // while(cc<=10){
        //     cc++;
        //     if (cc == 5 || cc == 7 || cc == 9){
        //         continue;  // continue joga para o cmeço do laço
        //     }
        //     System.out.println("Cambalhota" + cc);
        // }
        // int cc = 0;
        // while(cc<=10){
        //     cc++;
        //     if (cc == 2 || cc == 3 || cc == 4){
        //         continue;
        //     }
        //     if (cc == 7){
        //         break;  //break quebra de vez
        //     }
        //     System.out.println("Cambalhota" + cc);
        // }
    
        //part 02
        // inversa do while
        // int cc = 0;
        // do {
        //     System.out.println("cambalhota");
        //     cc++;
        // } while (cc<4);
        //para situações de ser colocado ate o ususario parar
        // teste logico no finall
        // int n, s=0;
        // String resp;
        // do{    //repita
        //     System.out.println("Digite um numero: ");
        //     n = teclado.nextInt();
        //     s += n;
        //     System.out.println("Quer continuar S/N? ");
        //     resp = teclado.next();
        // } while(resp.equals("S"));
        // System.out.println("A soma de todos os valores é "+s);
        // controle de fluxo bom para usar no primeiro exercicio
        
        //part 3
        // Repetição com variavel de controle
        
        
        
        // for (int cc=0; cc<100;cc+=10){   // criei a variavel cc, depois coloquei a condição enquanto, e depois pedi para somar
        //     System.out.println(cc);
            
        
        // } // = while(cc<4){
        //     // sYSTEM.OUT.PRINT("cambalhota")
        //} 

    
    
    
    
    
    
    
    }   

}