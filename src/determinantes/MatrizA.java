/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantes;

/**
 *
 * @author Aldair Cruz
 */
public class MatrizA {
     public det Adjunto(Integer mxn, Integer matriz[][], Integer columnas){
  
        Integer[][] valores = new Integer[mxn-1][mxn-1];
        
        int cc;
        int fila = 0;
       
        for(int i=1;i<mxn;i++){ 
           cc = 0;
            for(int j=0; j<mxn; j++){
       
                if(j!= columnas){
                   valores[cc][fila] = matriz[j][i];
                    cc++;
                }    
            }     
            fila++;
        }
        det dt = new det(mxn-1, valores);
        return dt;
    }
}
