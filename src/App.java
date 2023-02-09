import java.util.Scanner;

public class App {
    public static void main(String[] args){
        try (Scanner scanf = new Scanner(System.in)) {
            Tv quarTv = new Tv(1);
            Tv salaTv = new Tv(2);
            var o = 0;
            int opc;
            int opcao;
            int option;
            int channel;
   do{
            System.out.println("-Escolha qual controle da televisão utilizar-");
            System.out.println("1- Quarto");
            System.out.println("2- Sala");
            System.out.println("3- Sair");
            opc = scanf.nextInt();
            switch(opc){

                case 1:
                 System.out.println("-Ligue a Tv ou solte o controle-");
                System.out.println("1- Ligar");
                System.out.println("2- Soltar controle");
                opcao = scanf.nextInt();
               if(opcao==1){
                 quarTv.setLigado();
                do{
            
               
                System.out.println("1- Desligar Tv");
                System.out.println("2- Mudar canal");
                System.out.println("3- Aumentar Volume");
                System.out.println("4- Diminuir Volume");
                option = scanf.nextInt();

                switch(option){

                    case 1:
                    quarTv.setLigado();
                    break;

                    case 2:
                    System.out.println("Digite qual o canal que deseja");
                    channel = scanf.nextInt();
                    quarTv.setCanalAtual(channel);
                    break;
                    case 3:
                    quarTv.setVolume(2);
                    
                    break;

                    case 4:
                    quarTv.setVolume(1);
                    break;
                }
                }while(option!=1);
             
               }
                break;

                case 2:
                System.out.println("-Ligue a Tv ou solte o controle-");
                System.out.println("1- Ligar");
                System.out.println("2- Soltar controle");

                opcao = scanf.nextInt();
               if(opcao==1){

                salaTv.setLigado();
                do{
            
                System.out.println("1- Desligar Tv");
                System.out.println("2- Mudar canal");
                System.out.println("3- Aumentar Volume");
                System.out.println("4- Diminuir Volume");
                option = scanf.nextInt();

                switch(option){

                    case 1:
                    salaTv.setLigado();
                    break;

                    case 2:
                    System.out.println("Digite qual o canal que deseja");
                    channel = scanf.nextInt();
                    salaTv.setCanalAtual(channel);
                    break;

                    case 3:
                    salaTv.setVolume(2);
                    break;

                    case 4:
                    salaTv.setVolume(1);
                }
                }while(option!=1);
             
               }
                break;

                case 3:
                System.out.println("Saindo do ambiente");
                o=1;
                break;
            }
      
   }while(o!=1);
        }
    }
    
}
