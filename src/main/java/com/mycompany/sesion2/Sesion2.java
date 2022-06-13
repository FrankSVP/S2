/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sesion2;

import java.util.Scanner;

/**
 *
 * @author blood
 */
public class Sesion2 {

    public static void main(String[] args) {
     
       /* sumaDosNumerosVOID();
        System.out.println(sumaDosNumerosEntero());
        sumaDosNumeroArgumentos(4, 10);*/
       
       MenuPrincipal();
        
    }
    
    //Método normal
    public static void sumaDosNumerosVOID(){
    int num1=5;
    int num2=4;
    int resultado= num1+num2; 
    System.out.println("La suma es: "+ resultado);
    }
    
    //Método/Función que retorna un número entero
    public static int sumaDosNumerosEntero(){
    int num1=5;
    int num2=4;
    int resultado= num1+num2;    
    return resultado;           
    }
    //Método con argumentos
    
    public static void sumaDosNumeroArgumentos(int numero1,int numero2){
    int resultado= numero1+numero2; 
    System.out.println("La suma es: "+ resultado);
    }
    
    public static void MenuPrincipal(){
    
     Scanner scTeclado = new Scanner (System.in);
     
     int op;
    
        do { 
            System.out.println("*******MENU PRINCIPAL******");
            System.out.println("1: Suma 1");
            System.out.println("2: Suma 2");
            System.out.println("3: Salir");
            System.out.println("Ingrese la opción del Menú");
            
            op= scTeclado.nextInt();
            switch (op){
               case 1:
                   Opcion1();
                   break;
               case 2:
                   Opcion2();
                   break;
             
                default:
                    break;
                  
            }
            
        } while (op!=3);
     
        
    }
    
    public static void Opcion1(){
        System.out.println("Es la opcion1");
    }
    
    public static void Opcion2(){
        System.out.println("Es la opcion2");
    }
    
    
  
    
    
    
    
    
    
}
