/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Estudiante
 */
public class ConjuntoBits {
    Bitwise c[];
    int cant;

    public ConjuntoBits() {
        c = new Bitwise[1]; // un bitwise
        c[0]=new Bitwise(); // 
        cant = 32;
    }
    //cant = 32    63/32 = 1
    //I = 0        0 = 1 false    0 = 0 true
    //S = 0          S = S + bitwise[0]   bitwise = 00000000 00000000 00000000 00000000
    //S = 0          S = S + bitwise[0]   bitwise = 00000000 00000000 00000000 00001001
    // S = 0;
    public boolean vacia(){
        int i=0; int S=0; 
        while (i<=((cant-1)/32)) {
         S=S+c[i].x;            
          i++;
        }
        return (S==0);
    }
/*    private void Redimencionar(int Elemento){
        if(Elemento>cant){
        int NBitwise = ((Elemento-1)/32)+1;
        Bitwise C1[] = new Bitwise[NBitwise];
        System.arraycopy(c, 0, C1, 0, c.length);
        for (int i = 1; i <= NBitwise; i++) {
         c = new Bitwise[i];
         }
        System.arraycopy(C1, 0, c, 0, C1.length);
        cant = NBitwise*32;
        }
    }*/
    public int SacarNbit(int elemento){ 
        return ((elemento-1)%32)+1;
    }
    public int SacarNbitWise(int elemento){
        return ((elemento-1)/32);
    }
    public void Insertar(int elemento){
        Redimencionar2(elemento);
        int NBit = SacarNbit(elemento);
        int NBitwise = SacarNbitWise(elemento);
        c[NBitwise].set1(NBit);
    }
    public void Eliminar(int elemento){
        int NBit = SacarNbit(elemento);
        int NBitwise = SacarNbitWise(elemento);
        c[NBitwise].set0(NBit);
    }
    public boolean Pertenece(int elemento){
        int NBit = SacarNbit(elemento);
        int NBitwise = SacarNbitWise(elemento);
        return (c[NBitwise].getbit(NBit)==1);
    }
    public void union(ConjuntoBits A, ConjuntoBits B){
        for (int i = 1; i <= A.cant; i++) {
            if(A.Pertenece(i))
                Insertar(i);
        }
        for (int i = 1; i <= B.cant; i++) {
            if(B.Pertenece(i))
                Insertar(i);
        }
    }
    public void diferencia(ConjuntoBits A, ConjuntoBits B){
        for (int i = 1; i <=A.cant; i++) {
            if(i<=B.cant){
                if(A.Pertenece(i)&&!B.Pertenece(i))
                    Insertar(i);
            }
            else{
                if(A.Pertenece(i))  
                    Insertar(i);
            }
        }
    }
    public void intereseccion(ConjuntoBits A, ConjuntoBits B){
        for (int i = 1; i <=A.cant; i++) {
            if(i<=B.cant){
                if(A.Pertenece(i)&&B.Pertenece(i))
                    Insertar(i);
            }
        }
    }
    private void Redimencionar2(int elemento){
      if(elemento > cant){
      ConjuntoBits d = new ConjuntoBits(); 
      for (int i=0;i<d.c.length;i++){
          d.c[i]=c[i];
      }
      c=new Bitwise[(elemento%32)!=0?(elemento/32)+1:elemento/32];
      for (int i=0;i<c.length;i++){
          c[i]=new Bitwise();
          if(i<d.c.length){
               c[i]=d.c[i]; 
          }else{
              c[i]=c[i];
          }
      }
      cant=(SacarNbitWise(elemento)+1)*32;
        }
    }
    @Override
    public String toString() {
        if(!vacia()){
        String S ="[";
        for (int i = 1; i <=cant; i++) {
                 if(Pertenece(i))
                     S = S +i +", ";
               //  else
                //     S = S + i+" 0 ,";
        }
          S = S.substring(0,S.length()-2 )+ " ]\nCantidad de Bytes = "+(cant/32);
          return S;  
        }
        else
            return "[ ]";
    }
    public static void main(String[] args) {
        ConjuntoBits A = new ConjuntoBits();
        A.Insertar(3);
        A.Insertar(32);
        A.Insertar(33);
        System.out.println("A = "+A);
        ConjuntoBits B = new ConjuntoBits();
        B.Insertar(2);
        //B.Insertar(5);
        B.Insertar(3);
       // B.Insertar(7);
        System.out.println("B = "+B);
        //B.Eliminar(3);
        //B.Eliminar(2);
        //System.out.println("B = "+B);
        ConjuntoBits C = new ConjuntoBits();
        C.diferencia(A, B);
        System.out.println("C =" +C.toString());
    }
}
