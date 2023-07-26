package aula2;
import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        float n1, n2, n3, n4, mediaAritmetica, mediaHarmonica, mediaGeometrica;
        
        Scanner in = new Scanner (System.in);
        System.out.print("Informe nota 1..: ");
        n1 = in.nextFloat();
        System.out.print("Informe nota 2..: ");
        n2 = in.nextFloat();
        System.out.print("Informe nota 3..: ");
        n3 = in.nextFloat();
        System.out.print("Informe nota 4..: ");
        n4 = in.nextFloat();
        System.out.println("********SAÍDA********");
        //.Calculo da Média Aritmética:
        mediaAritmetica = (n1 + n2 + n3 + n4)/4;
        System.out.println("Média Aritmética: " +mediaAritmetica);
        
        //Calculo da Média Harmônica:
        mediaHarmonica = 4 / (1/n1 + 1/n2 + 1/n3 + 1/n4);
        System.out.println("Média Harmônica.: " +mediaHarmonica);
        
        //Calculo da Média Geométtrica:
        mediaGeometrica = (float) Math.pow((n1 * n2 * n3 * n4) , 1.0/4);
        System.out.println("Média Geométrica: " + mediaGeometrica);
        
    }
    
}
