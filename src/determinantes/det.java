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
public class det {
    Integer mxn;
    Integer[][] valores;
    public det(Integer mxn, Integer[][] matriz){
        this.mxn = mxn;
        this.valores = matriz;
    }
   MatrizA ma= new MatrizA();
    
    public Integer Solucionar(){
        Integer solucion=0;
        Integer adjunto;

        for(int i=0;i<this.mxn; i++){
            
            if(this.getMxn()==2){
                adjunto = (i==0)?valores[1][1]:valores[0][1];
            }else{
                adjunto = ma.Adjunto(mxn, valores, i).Solucionar();
            }
            if(i%2!=0){
                solucion-=valores[i][0]*adjunto;
            }else{ 
                solucion+=valores[i][0]*adjunto;
            }
        }
        return solucion;
    }
    
    
 public Integer getMxn() {
        return mxn;
    }
    
    public Integer[][] getValores(){
        return valores;
    }
}
