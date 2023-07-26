package aula4;
import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
        int  opcao;
        Scanner in = new Scanner (System.in);
        
        String menu = "1 - Prato do dia: \n"
                            + "2 - Promoção: \n"
                            + "3 - Salada: \n"
                            + "Escolha uma opção: ";
        System.out.print(menu);
        opcao = in.nextInt();
        
        switch(opcao){
          case 1:
                System.out.println("\n*******SAÍDA********");
                System.out.println("Feijoada - R$11,00");
                break;
          case 2:
                 System.out.println("\n*******SAÍDA********");
                 System.out.println("Omelete - R$6,50");
                 break;
          case 3:
                 System.out.println("\n*******SAÍDA********");
                 System.out.println("Alface | Tomate | Rúcula | Frango - R$13,00");
                 break;
          default:
                  System.out.println("\n*******SAÍDA********");
                  System.out.println("Opção Inválida! "); 
        }
    }
}
