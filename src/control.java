import java.util.Scanner;
public class control {
        
    int opc;
    int opcao;
    int option=0;
    int channel;
    int op;
    Scanner scanf = new Scanner(System.in);

    public int ligarTv(){
        System.out.println("\n-Ligue a Tv ou solte o controle-");
        System.out.println("      |1-      Ligar      |");
        System.out.println("      |2- Soltar controle |");
       opcao = scanf.nextInt();
        return opcao;
    }

    public int opcoes(){
        System.out.println("\n|1-   Desligar Tv    |");
        System.out.println("|2-   Mudar canal    |");
        System.out.println("|3- Aumentar Volume  |");
        System.out.println("|4- Diminuir Volume  |");
        System.out.println("|5-  Alterar canais  |");
   opcao = scanf.nextInt();
   return opcao;
    }

    public int mudarCanal(){
        System.out.println("\nDigite qual o canal que deseja");
        opcao = scanf.nextInt();
        return opcao;
    }
    public int alterarCanais(){
        System.out.println("\n|1-  Adicionar canal  |");
        System.out.println("|2-      Remover canal     |");
        System.out.println("|3-          Sair          |");
        opcao = scanf.nextInt();

        return opcao;

    }
}
