public class tvSmart extends model {
private String Login = "123456";
private String Senha = "987654";
private Boolean firstTime = true;
private Boolean Smart = false;
private int fabrica = 0;

public String getLogin(){
    return Login;
}

public void setLogin(String Login){
    this.Login = Login;
    System.out.println("Login alterada com sucesso");
}

public String getSenha(){
   
 return Senha;
}

public void setSenha(String Senha){
   this.Senha = Senha;
   System.out.println("Senha alterada com sucesso");
}

public Boolean getSmart(){
    return Smart;
}

public void setSmart(){
    if(Smart==false){
        Smart=true;
        
    }else{
        Smart=false;
       
    }
}

public Boolean getFirst(){
    return firstTime;
}

public void setFirst(Boolean firstTime){
    this.firstTime = firstTime;
}

public int getFabrica(){
     return fabrica;
}

public void setFabrica(int i){
    fabrica = i;
}

}