/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velha;

/**
 *
 * @author a120105
 */
public class Velha {
    Jogador jog;
    Jogador jog2;
    String tabuleiro[][] = new String[4][4]; 
    
    
    public  void IniciarJogo(){
        jog = new Jogador();
        jog2 = new Jogador();
      
        
    }
    
    public String verificar(){
        
        
        boolean velha = true;
        
        for(int i = 1; i < 4; i++){
            if(tabuleiro[i][1].equals(tabuleiro[i][2]) && tabuleiro[i][2].equals(tabuleiro[i][3])){
                return tabuleiro[i][1];
            }
            
             if(tabuleiro[1][i].equals(tabuleiro[2][i]) && tabuleiro[2][i].equals(tabuleiro[3][i])){
                return tabuleiro[1][i];
            }
        }
             
        if(tabuleiro[3][1].equals(tabuleiro[2][2]) && tabuleiro[2][2].equals(tabuleiro[1][3])){
            return tabuleiro[3][1];
        }
        if(tabuleiro[1][1].equals(tabuleiro[2][2]) && tabuleiro[2][2].equals(tabuleiro[3][3])){
            return tabuleiro[1][1];
        }
        
        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 4; j++){
                if(tabuleiro[i][j] == ""){
                    velha = false;
                }    
                
            }
        }
        
        if(velha){
            return "velha";
        }     

        return "- 1";
    }
   
}


