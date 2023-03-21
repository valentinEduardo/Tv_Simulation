import java.util.Scanner;

public class App {
    static int contador = 0;
    static  int contadorTv = 0;
    static int contadorSmart = 0;
    static  Tv[] tvs = new Tv[0];
    static  tvSmart[] smarts = new tvSmart[0];
    static  controle[] controlesSmart = new  controle[3];
    static  int[] quantidade = new int[3];

    public static void comprarTv() {
        if ( contadorTv == tvs.length) {
            // Copia toda a lista para um novo array, maior
            Tv[] novaLista = new Tv[tvs.length+1];
            System.arraycopy(tvs, 0, novaLista, 0, contadorTv);
            // Substitui a lista original
           tvs = novaLista;

        }
        tvs[contadorTv] = new Tv();
        tvs[contadorTv++].setID(contador);
        quantidade[contador]=1;
        controlesSmart[contador] = new controle();
        contador++;
        for (Tv s : tvs) {
            System.out.println(s);
        }
    }
    public static void comprarTvSmart() {
        if ( contadorSmart == smarts.length) {
            // Copia toda a lista para um novo array, maior
            tvSmart[] novaLista = new tvSmart[smarts.length+1];
            System.arraycopy(smarts, 0, novaLista, 0, contadorSmart);
            // Substitui a lista original
            smarts = novaLista;

        }

        smarts[contadorSmart] = new tvSmart();
        smarts[contadorSmart++].setID(contador);
        quantidade[contador]=2;
        controlesSmart[contador] = new controle();
        contador++;

        for (tvSmart s : smarts) {
            System.out.println(s);
        }
    }

    public static void main(String[] args){ 




        try (Scanner scanf = new Scanner(System.in)) {  
            int opc;
            int opcao;
            int opcao2;
            int opcao3;
            int opcao4;
            int opcao5;
            int op=0;
            int canal;
            String senha;
            String login;
            int i = 0;
do{
    System.out.println("             |1- comprar uma tv nova | ");
    System.out.println("             |2- ir para  casa | ");
    System.out.println("             |3-  Sair  |");
    opcao = scanf.nextInt();
    if(opcao==1){
         do{
        System.out.println("\n-Vc pode ter até 3 tvs-");
        System.out.println("\n-Escolha qual comprar-");
        System.out.println("             |1- Tv | ");
        System.out.println("             |2-  Smart Tv  |");
        System.out.println("             |3-  Sair  |");
        opc = scanf.nextInt();


         if ( opc== 1 && contador< 3 ) {
         
          comprarTv();
           System.out.println("Tv comprada");

        }else if(opc==1 && contador==3){
            System.out.println("Vc atingiu o número máximo de tvs");
        }

        if (opc == 2 && contador< 3 ) {
        
         comprarTvSmart();
            System.out.println("Tv comprada");

        }else if(opc==2 && contador==3){
            System.out.println("Vc atingiu o número máximo de tvs ou digitou errado");
        }

     }while(opc!=3);
    }else if(opcao==2 && contador>0){
        do{

            System.out.println("\n-Escolha qual controle da televisão utilizar-");
            if(quantidade[0]==1){
                System.out.println("             |1 Sala- Tv  | ");
            }else if(quantidade[0]==2){
                System.out.println("             |1 Sala- Tv smart  | ");
            }
            if(quantidade[1]==1){
                System.out.println("             |2 Quarto- Tv  | ");
            }else if(quantidade[1]==2){
                System.out.println("             |2 Quarto- Tv smart  | ");
            }
            if(quantidade[2]==1){
                System.out.println("             |3 Varanda- Tv  | ");
            }else if(quantidade[2]==2){
                System.out.println("             |3 Varanda- Tv smart  | ");
            }
            System.out.println("             |4- Sair   | ");
            opc = scanf.nextInt();

if(quantidade[opc-1]==1){
    i=0;
    if(tvs[i].getID()!=opc-1){
        while(i<3 && tvs[i].getID()!=opc-1){
            i++;

        }
    }

   if(i<3){
       opcao2 = controlesSmart[i].ligarTv();
       if(opcao2==1){
           tvs[i].setLigado();

           do{
               opcao3 = controlesSmart[i].opcoesTv();
               switch(opcao3){

                   case 1:
                       tvs[i].setLigado();
                       break;

                   case 2:

                       tvs[i].setCanalAtual(controlesSmart[i].mudarCanal());
                       break;
                   case 3:
                       tvs[i].setVolume(2);

                       break;

                   case 4:
                       tvs[i].setVolume(1);
                       break;
                   case 5:
                       opcao5 =   controlesSmart[i].alterarCanais();
                       if(opcao5==1){
                           System.out.println("\nDigite qual canaldeseja adicionar");
                           canal = scanf.nextInt();
                           tvs[i].adicionarCanais(canal);
                       }else if(opcao5==2){
                           System.out.println("\nDigite qual canal deseja excluir");
                           canal = scanf.nextInt();
                           tvs[i].removerCanais(canal);
                       }
                       break;
               }
           }while(opcao3!=1);

       }
   }

}else if(quantidade[opc-1]==2){
    i=0;
    if(smarts[i].getID()!=opc-1){
    while(i<3 && smarts[i].getID()!=opc-1){
        i++;
    }
}
    if(i<3){
        do{
            opcao4 = controlesSmart[i].ligarTv();
            if(opcao4==1){
                smarts[i].setLigado();
                smarts[i].message();
                do{
                    opcao2 = controlesSmart[i].opcoes();
                    switch(opcao2){

                        case 1:
                            smarts[i].setLigado();
                            smarts[i].message();
                            break;

                        case 2:

                            smarts[i].setCanalAtual(controlesSmart[i].mudarCanal());
                            break;

                        case 3:
                            smarts[i].setVolume(2);
                            break;

                        case 4:
                            smarts[i].setVolume(1);
                            break;

                        case 5:
                            smarts[i].setSmart();
                            if(smarts[i].getFirst()==true &&  smarts[0].getFabrica()==0){
                                System.out.println("\nPor ser a sua primeria conexão o Login é o Padrão: "+ smarts[i].getLogin()+" \nAltere-a depois nas configurações");
                                System.out.println("\nPor ser a sua primeria conexão a Senha é o Padrão: "+ smarts[i].getSenha()+" \nAltere-a depois nas configurações");
                                smarts[i].setFirst(false);
                                smarts[i].setFabrica(1);
                            }else if( smarts[i].getFabrica()==1){
                                do{
                                    System.out.println("\n|Digite seu Login|");
                                    login = scanf.next();
                                    System.out.println("|Digite sua senha|");
                                    senha = scanf.next();

                                    if(login.equals( smarts[i].getLogin()) && senha.equals( smarts[i].getSenha())){
                                        System.out.println("Logando");
                                        op=-1;
                                        smarts[i].setFabrica(2);
                                    }else{

                                        System.out.println("Login ou senha incorretos");
                                        op=6;

                                    }

                                }while(op==6);

                            }else if( smarts[i].getFabrica()==2){
                                System.out.println("Entrando no modo Smart");
                            }

                            do{
                                opcao3 = controlesSmart[i].opcoes2();
                                switch(opcao3){
                                    case 1:
                                        smarts[i].setSmart();
                                        break;

                                    case 2:
                                        smarts[i].setSmart();
                                        smarts[i].setFabrica(1);
                                        break;
                                    case 3:
                                        smarts[i].setSmart();
                                        smarts[i].setLigado();
                                        smarts[i].message();
                                        opcao = 1;
                                        break;
                                    case 4:

                                        if(controlesSmart[i].mudarLogin()==1){
                                            System.out.println("\nDigite o novo login");
                                            String novoLogin = scanf.next();
                                            smarts[i].setLogin(novoLogin);
                                        }else if(controlesSmart[0].mudarLogin()==2){
                                            System.out.println("Digite a nova senha");
                                            String novaSenha = scanf.next();
                                            smarts[i].setSenha(novaSenha);
                                        }
                                        break;
                                    case 5:
                                        smarts[i].setVolume(2);
                                        break;


                                    case 6:
                                        smarts[i].setVolume(1);
                                        break;

                                }
                            }while(opcao3!=1 && opcao3!=2 && opcao3!=3);
                            break;
                        case 6:
                            opcao5 =   controlesSmart[i].alterarCanais();
                            if(opcao5==1){
                                System.out.println("\nDigite qual canaldeseja adicionar");
                                canal = scanf.nextInt();
                                smarts[i].adicionarCanais(canal);
                            }else if(opcao5==2){
                                System.out.println("\nDigite qual canal deseja excluir");
                                canal = scanf.nextInt();
                                smarts[i].removerCanais(canal);
                            }
                            break;


                    }
                }while(opcao2!=1 && smarts[i].getLigado()!=false);

            }
        }while(opcao4!=2);
    }

}

        }while(opc!=4);

    }else if(opcao==2 && contador==0){
        System.out.println("Compre uma Tv primeiro!");
    }else{
        System.out.println("Saindo");
    }
   

}while(opcao!=3);
        }
    }
    
}