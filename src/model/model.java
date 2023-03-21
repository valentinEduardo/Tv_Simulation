package model;
public abstract class model {
private int indice;
private int id;
    private boolean ligado;
    private int volume;
    private int canalAtual; 
    private int tamanho = 5;
    private static int[] canais = new int[5];{
    canais[0] = 1;
    canais[1] = 3;
    canais[2] = 5;
    canais[3] = 7;
    canais[4] = 11;
    }
   

    public void adicionarCanais(int i) {
        if ( tamanho == canais.length && !verifCanais(-1) && !verifCanais(i) ) {
            // Copia toda a lista para um novo array, maior
            int[] novaLista = new int[canais.length+1];
            System.arraycopy(canais, 0, novaLista, 0, tamanho);
            // Substitui a lista original
            canais = novaLista;
             canais[tamanho++] = i;
               for (int s : canais) {
            System.out.println(s);
        }
        }else if(verifCanais(-1)){
            canais[indice] = i;
            for (int s : canais) {
                System.out.println(s);
            }
        }else{
            System.out.println("O canal já existe");
        }
      
    }

    public void print(){
        for (int i : canais) {
            System.out.println(i);

        }
        System.out.print("\n"+tamanho);
    }
   
    public void removerCanais(int i){
        if(verifCanais(i)){
            canais[indice]=-1;
            System.out.println("O canal foi excluido");
        }
    }

    
    
    public model(){
        ligado = false;
        volume = 0;
        canalAtual = canais[0];
    }

public void message(){
    if(ligado==true){
        System.out.println("A Tv foi Ligada");
    }else{
        System.out.println("A Tv está desligada");
    }
}
    public boolean getLigado(){
        return ligado;
    }
    
    public void setLigado(){
      if(ligado==false){
        ligado = true;
      }else{
        ligado=false;
      }

    }

    public void getVolume(){
 System.out.println("Este é o volume agora = "+volume);
    }

    public void setVolume(int i){
        if(i==1 &&volume<=100 && volume>0){
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
    if(canal>0 || canal==-1){
        while( i<canais.length && canal!=canais[i] ){
     i++;
    }
    if (i>=canais.length){
        return false;
    }else{
        indice=i;
        return true;
    }
    }else{
        return false;
    }
   }
   public void setID(int id){
       this.id = id;
   }
    public int getID(){
       return id;
    }
}
