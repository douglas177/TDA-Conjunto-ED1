/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.HashSet;

/**
 *
 * @author Estudiante
 */
public class Bitwise {
    int x;
    // 1 Entero tiene 32 bits = 4 bytes
    public Bitwise() {
        this.x = 0;
        //System.out.println(Integer.toBinaryString(x));
        //x = 00000000 00000000 00000000 00000000 // 0
    }
    public void set1(int pos){
        int mask = 1;
        //x = 00000000 00000000 00000000 00000001 // 1
        mask = mask<<pos-1;
        x = x|mask;
    }
    public void set0(int pos){
        int mask = 1;
        mask = mask<<pos-1;
        mask = ~mask;
        x = x&mask;
    }
    
    public int getbit(int pos){
        int mask = 1;
        mask = mask<<pos-1;
        mask = x&mask;
        mask = mask>>>pos-1;
        return mask;
    }

    @Override
    public String toString() {
        String S="| ";
        for (int i = 32; i >=1; i--) {
            if(i%8==0 && i != 32) S = S + "   | ";
            S=S+getbit(i)+" | ";
            
        }
        return S;
    }
    public static void main(String[] args) {
        Bitwise A = new Bitwise();
        A.set1(5);
        A.set1(3);
        A.set1(6);
        A.set1(1);
        
        System.out.println(A.toString());
        A.set0(3);
        System.out.println(A.toString());
    }
}
