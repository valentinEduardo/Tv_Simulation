import java.util.Scanner;
public class controleSmart {
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
        System.out.println("|5-     Conectar     |");
        System.out.println("|6-  Alterar canais  |");
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
        opcao = scanf.nextInt();

        return opcao;

    }

    public int opcoes2(){
        System.out.println("\n|1-  Sair do Modo Smart  |");
        System.out.println("|2-      Desconectar     |");
        System.out.println("|3-      Desligar Tv     |");
        System.out.println("|4- Mudar Login ou senha |");
        System.out.println("|5-    Aumentar Volume   |");
        System.out.println("|6-    Diminuir Volume   |");
        opcao = scanf.nextInt();

        return opcao;

    }
    public int mudarLogin(){
        System.out.println("\nDeseja mudar o login ou a senha?");
                            System.out.println("          |1- Login|");
                            System.out.println("          |2- senha|");
                            opcao = scanf.nextInt();

        return opcao;

    }
    
    


}
