public class Tv {
    private int id;
    private Boolean ligado;
    private int volume;
    private int canalAtual;
    private int[] canais = new int[5];{
    canais[0] = 1;
    canais[1] = 3;
    canais[2] = 5;
    canais[3] = 7;
    canais[4] = 11;
    }

   
    
    
    public Tv(int id){
        ligado = false;
        volume = 0;
        canalAtual = canais[0];
        this.id = id;
    }

    public void getLigado(){
         if(ligado==true){
            System.out.println("A Tv está ligada");
        }else{
            System.out.println("A Tv está desligada");
        }
    }
    
    public void setLigado(){
      if(ligado==false){
        ligado = true;
        System.out.println("A Tv foi Ligada");
      }else{
        ligado=false;
        System.out.println("A Tv foi Desligada");
      }

    }

    public void getVolume(){
 System.out.println("Este é o volume agora = "+volume);
    }

    public void setVolume(int i){
        if(i==1 &&volume<=100 && volume>=0){
           this.volume--;
            getVolume();
        }else if(i==2 &&volume<=100 && volume>=0){
            this.volume++;
            getVolume();
        }
    }

    public int getCanalAtual(){
return canalAtual;
    }

    public void setCanalAtual(int canal){
        if( verifCanais(canal)){
     this.canalAtual = canal;
     System.out.println("O canal foi alterado para o "+canal);
        }else{
            System.out.println("Número de canal inexistente");
        }
       
    }

   public boolean verifCanais(int canal){
    int i = 0;
    while(canal!=canais[i] && i<canais.length){
     i++;
    }
    if (i>=5){
        return false;
    }else{
        return true;
    }

   }
}

