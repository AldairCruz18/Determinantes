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
public class Determinantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[][] valores={{2,-1,1},{4,6,-3},{1,-4,5}};
        Integer [][] valores1={{1,3,-7},{3,-2,8},{-7,8,0}};
        
        det matriz = new det(3,valores);
        det matriz1= new det(3,valores1);
        
        System.out.println("Solucion: ");
        System.out.println(matriz.Solucionar());
        
        System.out.println("Solucion 2:");
        System.out.println(matriz1.Solucionar());
    }
    
}
