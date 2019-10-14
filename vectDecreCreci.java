/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec_decre_creci;

import java.util.Scanner;

//Leer por teclado una serie de 10 numeros enteros
//mostrar si estan en orden creciente, decreciente o desordenados

/**
 *
 * @author Felix Castro
 */
public class vectDecreCreci {
    public static void main(String[] args) {
        //leemos por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables y vectores
        int [] vector;
        int elem;
        boolean decre = false;
        boolean crec = false;
        
        System.out.println("VECTOR EN FORMA CRECIENTE, DECRECIENTE Y ORDENADO");
        System.out.println("-----------------------------------------");
        
        //ingresamos cuantos numeros vamos a guardar
        System.out.println("Digite cuantos numeros va guardar");
        elem = entrada.nextInt();
        
        //tamaño del vector
        vector = new int[elem];
        
        System.out.println("-----------------------------------------");
        
        //llenamos el vector
        System.out.println("Registro de numeros");
        for (int i = 0; i < vector.length; i++) {
            System.out.println((i+1)+".Digite un numero");
            vector[i] = entrada.nextInt();
        }
        
        //comprobamos
        for (int i = 0; i < vector.length-1; i++) {
            if (vector[i]<vector[i+1]) {
                crec = true;
            }
            if (vector[i]>vector[i+1]) {
                decre = true;
            }
        }
        
        if (crec == true && decre == false) {
            System.out.println("Vector creciente");
        } else {
            if (crec == false && decre == true) {
                System.out.println("Vector decreciente");
            } else {
                if (crec == true && decre == true) {
                    System.out.println("Vector desordenado");
                } else {
                    if (crec == false && decre == false) {
                        System.out.println("Vector con elementos iguales");
                    }
                }
            }
        }
    }
}
