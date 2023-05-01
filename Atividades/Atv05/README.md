# Atv 05
Nesse atividade foi pego os gastos trimestrais da atividade anterior (atv04) e feito a media mensal onde foi criado uma variavel escrita media mensal que receve os gastostrimestrais divido
por 3 assim descobrindo a media mensal, dessa forma como era double daria muitas casas alem da vírgula logo criei uma variavel do tipo string para poder formatar o double para somente 2 casas
e depois o print dos resultados ja formatado!

~~~java
import java.util.Scanner;

public class BalancoTrimestral {
    public static void main(String[] args) {
        double gastosJaneiro = 30000.00;  
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println(gastosTrimestre);
        // Questao 5:
        double mediaMensal = gastosTrimestre/3;
        String mediaFormatada = String.format("%.2f", mediaMensal);
        System.out.format("Valor da média mensal= " + mediaFormatada);

    }
}
~~~