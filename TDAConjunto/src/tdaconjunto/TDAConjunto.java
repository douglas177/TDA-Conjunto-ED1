/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdaconjunto;

import Negocio.Bitwise;
import Negocio.Conjunto;
import Negocio.ConjuntoBits;

/**
 *
 * @author Estudiante
 */
public class TDAConjunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Bitwise A = new Bitwise();
        A.set1(5);
        A.set1(32);
        System.out.println(A.toString()+"\n");
        A.set0(5);
        System.out.println(A.toString());*/
        ConjuntoBits A = new ConjuntoBits();
        A.Insertar(5);
        A.Insertar(3);
        A.Insertar(4);
        System.out.println(A);
        /*float a = 5  % 32;
        boolean x = a!=0;
        System.out.println(x);*/
        
    }
    
}
