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
public class Conjunto {

    int c[];
    int dim;

    public Conjunto() {
        c = new int[10];
        this.dim = -1;
    }

    public boolean vacia() {
        return dim == -1;
    }

    private boolean Pertenece(int elemento) {
        int i = 0;
        while ((i <= dim) && (c[i] != elemento)) {
            i++;
        }
        return (i <= dim);
    }

    private void Redimencionar(int elemento) {

    }

    public void Insertar(int elemento) {
        if (vacia()) {
            dim++;
            c[dim] = elemento;
        } else {
            if (!Pertenece(elemento)) {
                Redimencionar(elemento);
                dim++;
                c[dim] = elemento;
            } else {

            }
        }
    }

    public void Eliminar(int Elemento) {
        int i = 0;
        while ((i <= dim) && (c[i] != Elemento)) {
            i++;
        }
        if (i <= dim) {
            for (int j = i; j < dim; j++) {
                c[j] = c[j + 1];
            }
            dim--;
        }
    }

    @Override
    public String toString() {
        if(!vacia()){
        String S ="[";
        for (int i = 1; i <dim*32; i++) {
                S = S + i+" ,";
        }
          return S;  
        }
        else
            return "[ ]";
    }
}
