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
