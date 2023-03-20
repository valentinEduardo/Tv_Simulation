import java.util.Scanner;

public class App {

    public static void main(String[] args){ 
   int contador = 0;
     Tv[] tvs = new Tv[3];
     tvSmart[] smarts = new tvSmart[3];
      int[] quantidade = new int[3];

    
       
        
     for (Tv s : tvs) {
                 System.out.println(s);
     }
        try (Scanner scanf = new Scanner(System.in)) {
            tvSmart quarTv = new tvSmart();
            tvSmart salaTv = new tvSmart();
            Tv varTv = new Tv();  
            int opc;
            int opcao;
            int option=0;
            int channel;
            int op;
            
            String senha;
            String login;
do{
    System.out.println("             |1- comprar uma tv nova | ");
    System.out.println("             |2- ir para  casa | ");
    System.out.println("             |3-  Sair  |");
    opc = scanf.nextInt();
    if(opc==1){
         do{
        System.out.println("\n-Vc pode ter até 3 tvs-");
        System.out.println("\n-Escolha qual comprar-");
        System.out.println("             |1- Tv | ");
        System.out.println("             |2-  Smart Tv  |");
        opc = scanf.nextInt();


         if ( opc== 1 && contador< 3 ) {
         
           tvs[contador] = new Tv();
           contador++;
        }else{
            System.out.println("Vc atingiu o número máximo de tvs");
        }

        if (opc == 2 && contador< 3 ) {
        
           smarts[contador] = new tvSmart();
           contador++;
        }else{
            System.out.println("Vc atingiu o número máximo de tvs ou digitou errado");
        }

     }while();
    }else if(opc==2 && contador>0){

    }else if(opc==2 && conttador==0){
        System.out.println("Compre uma Tv primeiro!");
    }else{
        System.out.println("Saindo");
    }
   

}while(opc!=3);
      

    
   do{
            System.out.println("\n-Escolha qual controle da televisão utilizar-");
            System.out.println("             |1- Quarto  | ");
            System.out.println("             |2-  Sala   |");
            System.out.println("             |3- Varanda |");
            System.out.println("             |4-   Sair  |");
            opc = scanf.nextInt();
            if(opc==1 || opc==2){
               switch(opc){

                case 1:
                
                 System.out.println("\n-Ligue a Tv ou solte o controle-");
                 System.out.println("      |1-      Ligar      |");
                 System.out.println("      |2- Soltar controle |");
                opcao = scanf.nextInt();
                if(opcao==1){

                    quarTv.setLigado();
                    quarTv.message();
                    do{
                
                        System.out.println("\n|1-   Desligar Tv    |");
                        System.out.println("|2-   Mudar canal    |");
                        System.out.println("|3- Aumentar Volume  |");
                        System.out.println("|4- Diminuir Volume  |");
                        System.out.println("|5-     Conectar     |");
                    option = scanf.nextInt();
    
                    switch(option){
    
                        case 1:
                       quarTv.setLigado();
                       quarTv.message();
                        break;
    
                        case 2:
                        System.out.println("\nDigite qual o canal que deseja");
                        channel = scanf.nextInt();
                        quarTv.setCanalAtual(channel);
                        break;
    
                        case 3:
                       quarTv.setVolume(2);
                        break;
    
                        case 4:
                        quarTv.setVolume(1);
                        break;
    
                        case 5:
                       quarTv.setSmart();
                        if(quarTv.getFirst()==true && quarTv.getFabrica()==0){
                            System.out.println("\nPor ser a sua primeria conexão o Login é o Padrão: "+quarTv.getLogin()+" \nAltere-a depois nas configurações");
                         System.out.println("\nPor ser a sua primeria conexão a Senha é o Padrão: "+quarTv.getSenha()+" \nAltere-a depois nas configurações"); 
                        quarTv.setFirst(false);
                         quarTv.setFabrica(1);
                        }else if(quarTv.getFabrica()==1){
                            do{
                            System.out.println("\n|Digite seu Login|");
                            login = scanf.next();
                            System.out.println("|Digite sua senha|");
                            senha = scanf.next(); 
                            
    if(login.equals(quarTv.getLogin()) && senha.equals(quarTv.getSenha())){
        System.out.println("Logando");
        op=-1;
        quarTv.setFabrica(2);
    }else{
        
        System.out.println("Login ou senha incorretos");
        op=6;
        
    }
                            
                            }while(op==6);
                            
                        }else if(quarTv.getFabrica()==2){
                            System.out.println("Entrando no modo Smart");
                        }
                        
                        do{
                        System.out.println("\n|1-  Sair do Modo Smart  |");
                        System.out.println("|2-      Desconectar     |");
                        System.out.println("|3-      Desligar Tv     |");
                        System.out.println("|4- Mudar Login ou senha |");
                        System.out.println("|5-    Aumentar Volume   |");
                        System.out.println("|6-    Diminuir Volume   |");
                        op = scanf.nextInt();
                        switch(op){
                            case 1:
                            quarTv.setSmart();
                            break;
    
                            case 2:
                           quarTv.setSmart();
                           quarTv.setFabrica(1);
                            break;
                            case 3:
                            quarTv.setSmart();
                           quarTv.setLigado();
                            break;
                            case 4:
                            System.out.println("\nDeseja mudar o login ou a senha?");
                            System.out.println("          |1- Login|");
                            System.out.println("          |2- senha|");
                            int u = scanf.nextInt();
                            if(u==1){
                                System.out.println("\nDigite o novo login");
                                String novoLogin = scanf.next();
    quarTv.setLogin(novoLogin);
                            }else if(u==2){
                                System.out.println("Digite a nova senha");
                                String novaSenha = scanf.next();
    quarTv.setSenha(novaSenha);
                            }
                            break;
                            case 5:
                            quarTv.setVolume(2);
                            break;
                          
    
                            case 6:
                            quarTv.setVolume(1);
                            break;
                           
                        }
                        }while(op!=1 && op!=2 && op!=3);
                      
    
                        break;
                    }
                    }while(option!=1 && quarTv.getLigado()==true);
                 break;
                   }
                break;

                case 2:
                System.out.println("\n-Ligue a Tv ou solte o controle-");
                System.out.println("      |1-       Ligar      |");
                System.out.println("      |2-  Soltar controle |");

                opcao = scanf.nextInt();

               if(opcao==1){

                salaTv.setLigado();
                salaTv.message();
                do{
            
                System.out.println("\n|1-   Desligar Tv    |");
                System.out.println("|2-   Mudar canal    |");
                System.out.println("|3- Aumentar Volume  |");
                System.out.println("|4- Diminuir Volume  |");
                System.out.println("|5-     Conectar     |");
                option = scanf.nextInt();

                switch(option){

                    case 1:
                    salaTv.setLigado();
                    salaTv.message();
                    break;

                    case 2:
                    System.out.println("\nDigite qual o canal que deseja");
                    channel = scanf.nextInt();
                    salaTv.setCanalAtual(channel);
                    break;

                    case 3:
                    salaTv.setVolume(2);
                    break;

                    case 4:
                    salaTv.setVolume(1);
                    break;

                    case 5:
                    salaTv.setSmart();
                    if(salaTv.getFirst()==true && salaTv.getFabrica()==0){
                        System.out.println("\nPor ser a sua primeria conexão o Login é o Padrão: "+salaTv.getLogin()+" \nAltere-a depois nas configurações");
                     System.out.println("\nPor ser a sua primeria conexão a Senha é o Padrão: "+salaTv.getSenha()+" \nAltere-a depois nas configurações"); 
                     salaTv.setFirst(false);
                     salaTv.setFabrica(1);
                    }else if(salaTv.getFabrica()==1){
                        do{
                        System.out.println("|\n Digite seu Login |");
                        login = scanf.next();
                        System.out.println("| Digite sua senha |");
                        senha = scanf.next(); 
if(login.equals(salaTv.getLogin()) && senha.equals(salaTv.getSenha())){
    System.out.println("Logando");
    op=-1;
    salaTv.setFabrica(2);
}else{
    
    System.out.println("Login ou senha incorretos");
    op=6;
    
}
                        
                        }while(op==6);
                        
                    }else if(salaTv.getFabrica()==2){
                        System.out.println("\nEntrando no modo Smart");
                    }
                    
                    do{
                        System.out.println("\n|1-  Sair do Modo Smart  |");
                        System.out.println("|2-      Desconectar     |");
                        System.out.println("|3-      Desligar Tv     |");
                        System.out.println("|4- Mudar Login ou senha |");
                        System.out.println("|5-    Aumentar Volume   |");
                        System.out.println("|6-    Diminuir Volume   |");
                    op = scanf.nextInt();
                    switch(op){
                        case 1:
                        salaTv.setSmart();
                        break;

                        case 2:
                        salaTv.setSmart();
                        salaTv.setFabrica(1);
                        break;
                        case 3:
                        salaTv.setSmart();
                        salaTv.setLigado();
                        break;
                        case 4:
                        System.out.println("\nDeseja mudar o login ou a senha?");
                        System.out.println("          |1- Login|");
                        System.out.println("          |2- senha|");
                        int u = scanf.nextInt();
                        if(u==1){
                            System.out.println("\n| Digite o novo login |");
                            String novoLogin = scanf.next();
salaTv.setLogin(novoLogin);
                        }else if(u==2){
                            System.out.println("\n| Digite a nova senha |");
                            String novaSenha = scanf.next();
salaTv.setSenha(novaSenha);
                        }
                        break;
                        case 5:
                        salaTv.setVolume(2);
                        break;
                      

                        case 6:
                        salaTv.setVolume(1);
                        break;
                       
                    }
                    }while(op!=1 && op!=2 && op!=3);
                  

                    break;
                }
                }while(option!=1 && salaTv.getLigado()==true);
             break;
               }
                break;

                
            } 
            }else if(opc==3){
                     System.out.println("\n-Ligue a Tv ou solte o controle-");
                    System.out.println("      |1-      Ligar     |");
                    System.out.println("      |2- Soltar controle|");
                    opcao = scanf.nextInt();
                   if(opcao==1){
                     tvs[0].setLigado();
                     
                    do{
                
                   
                        System.out.println("\n|1-   Desligar Tv    |");
                        System.out.println("|2-   Mudar canal    |");
                        System.out.println("|3- Aumentar Volume  |");
                        System.out.println("|4- Diminuir Volume  |");
                    option = scanf.nextInt();
    
                    switch(option){
    
                        case 1:
                        varTv.setLigado();
                        break;
    
                        case 2:
                        System.out.println("\nDigite qual o canal que deseja");
                        channel = scanf.nextInt();
                        varTv.setCanalAtual(channel);
                        break;
                        case 3:
                        varTv.setVolume(2);
                        
                        break;
    
                        case 4:
                        varTv.setVolume(1);
                        break;
                    }
                    }while(option!=1);
                 
                   }

                    }
                  
   }while(opc!=4);
        }
    }
    
}
