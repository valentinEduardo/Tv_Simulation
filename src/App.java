import java.util.Scanner;

public class App {

    public static void main(String[] args){ 
   int contador = 0;
     Tv[] tvs = new Tv[3];
     tvSmart[] smarts = new tvSmart[3];
     control[] controles = new control[3];
     controleSmart[] controlesSmart = new  controleSmart[3];
      int[] quantidade = new int[3];

    
       
        
     for (Tv s : tvs) {
                 System.out.println(s);
     }
        try (Scanner scanf = new Scanner(System.in)) {  
            int opc;
            int opcao;
            int opcao2;
            int opcao3;
            int opcao4;
            int op=0;
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
        System.out.println("             |3-  Sair  |");
        opc = scanf.nextInt();


         if ( opc== 1 && contador< 3 ) {
         
           tvs[contador] = new Tv();
           quantidade[contador]=1;
           controles[contador] = new control();
           contador++;
           
        }else if(opc==1 && contador==3){
            System.out.println("Vc atingiu o número máximo de tvs");
        }

        if (opc == 2 && contador< 3 ) {
        
           smarts[contador] = new tvSmart();
           quantidade[contador]=2;
           controlesSmart[contador] = new controleSmart();
           contador++;
        }else if(opc==2 && contador==3){
            System.out.println("Vc atingiu o número máximo de tvs ou digitou errado");
        }

     }while(opc!=3);
    }else if(opc==2 && contador>0){

    }else if(opc==2 && contador==0){
        System.out.println("Compre uma Tv primeiro!");
    }else{
        System.out.println("Saindo");
    }
   

}while(opc!=3);
      

    
   do{
  
            System.out.println("\n-Escolha qual controle da televisão utilizar-");
            if(quantidade[0]==1){
                 System.out.println("             |1- Tv  | ");
            }else if(quantidade[0]==2){
                System.out.println("             |1- Tv smart  | ");
            }
           if(quantidade[1]==1){
             System.out.println("             |2- Tv  | ");
           }else if(quantidade[1]==2){
            System.out.println("             |2- Tv smart  | ");
        }
        if(quantidade[2]==1){
            System.out.println("             |3- Tv  | ");
          }else if(quantidade[2]==2){
           System.out.println("             |3- Tv smart  | ");
       }
            opc = scanf.nextInt();
            

               switch(opc){

                case 1:

                if(quantidade[0]==2){

do{

    opcao4 = controlesSmart[0].ligarTv();
    if(opcao4==1){
                    smarts[0].setLigado();
                    smarts[0].message();
                    do{
                        opcao2 = controlesSmart[0].opcoes();
                     switch(opcao2){
    
                        case 1:
                        smarts[0].setLigado();
                        smarts[0].message();
                        break;
    
                        case 2:
                        
                        smarts[0].setCanalAtual(controlesSmart[0].mudarCanal());
                        break;
    
                        case 3:
                        smarts[0].setVolume(2);
                        break;
    
                        case 4:
                        smarts[0].setVolume(1);
                        break;
    
                        case 5:
                        smarts[0].setSmart();
                        if(smarts[0].getFirst()==true &&  smarts[0].getFabrica()==0){
                            System.out.println("\nPor ser a sua primeria conexão o Login é o Padrão: "+ smarts[0].getLogin()+" \nAltere-a depois nas configurações");
                         System.out.println("\nPor ser a sua primeria conexão a Senha é o Padrão: "+ smarts[0].getSenha()+" \nAltere-a depois nas configurações"); 
                         smarts[0].setFirst(false);
                         smarts[0].setFabrica(1);
                        }else if( smarts[0].getFabrica()==1){
                            do{
                            System.out.println("\n|Digite seu Login|");
                            login = scanf.next();
                            System.out.println("|Digite sua senha|");
                            senha = scanf.next(); 
                            
    if(login.equals( smarts[0].getLogin()) && senha.equals( smarts[0].getSenha())){
        System.out.println("Logando");
        op=-1;
        smarts[0].setFabrica(2);
    }else{
        
        System.out.println("Login ou senha incorretos");
        op=6;
        
    }
                            
                            }while(op==6);
                            
                        }else if( smarts[0].getFabrica()==2){
                            System.out.println("Entrando no modo Smart");
                        }
                        
                        do{
                            opcao3 = controlesSmart[0].opcoes2();
                        switch(opcao3){
                            case 1:
                            smarts[0].setSmart();
                            break;
    
                            case 2:
                            smarts[0].setSmart();
                            smarts[0].setFabrica(1);
                            break;
                            case 3:
                            smarts[0].setSmart();
                            smarts[0].setLigado();
                            smarts[0].message();
                            opcao = 1;
                            break;
                            case 4:
                           
                            if(controlesSmart[0].mudarLogin()==1){
                                System.out.println("\nDigite o novo login");
                                String novoLogin = scanf.next();
                                smarts[0].setLogin(novoLogin);
                            }else if(controlesSmart[0].mudarLogin()==2){
                                System.out.println("Digite a nova senha");
                                String novaSenha = scanf.next();
                                smarts[0].setSenha(novaSenha);
                            }
                            break;
                            case 5:
                            smarts[0].setVolume(2);
                            break;
                          
    
                            case 6:
                            smarts[0].setVolume(1);
                            break;
                           
                        }
                        }while(opcao3!=1 && opcao3!=2 && opcao3!=3);
                      
    
                        
                    }   
                    }while(opcao2!=1 && smarts[0].getLigado()!=false);

                    }
}while(opcao4!=2);
                   
                 break;

                   }else if(quantidade[0]==1){

                   opcao2 = controles[0].ligarTv();
                   if(opcao2==1){
                     tvs[0].setLigado();
                     
                    do{
             opcao3 = controles[0].opcoes();
                    switch(opcao3){
    
                        case 1:
                        tvs[0].setLigado();
                        break;
    
                        case 2:
                        
                        tvs[0].setCanalAtual(controles[0].mudarCanal());
                        break;
                        case 3:
                        tvs[0].setVolume(2);
                        
                        break;
    
                        case 4:
                        tvs[0].setVolume(1);
                        break;
                        case 5:
tvs[0].adicionarCanais(10);
                        break;
                    }
                    }while(opcao3!=1);
                 
                   }
                   }
               }
             
                
              

               
                
        
                    

                    
                  
   }while(opc!=4);
        }
    }
    
}
