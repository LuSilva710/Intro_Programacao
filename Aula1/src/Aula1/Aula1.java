
package Aula1;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        double distancia, qtdCombustivel, consumo;
     
        Scanner in = new Scanner (System.in) ;
        System.out.print("Informe a distância percorrida...........: ");
        distancia = in.nextDouble();
        System.out.print("Informe a quantidade de combustível gasta: " );
        qtdCombustivel = in.nextDouble();
        consumo = distancia/qtdCombustivel;
        System.out.print("Consumo médio............................: " + consumo + " Km/L ");
    }
    
}
