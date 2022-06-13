/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion2;

/**
 *
 * @author blood
 */
public class CSesion2 {
    
         //Ingreso de Datos por Teclado
       Scanner sc = new Scanner(System.in);
       
        /*
            Programación estática 
        int num1 =10;
        int num2 =10;
        
        int Resultado = num1+num2;
        System.out.println("El resultado es: "+Resultado);*/
        
        //Suma de dos número dinámicos por teclado
        
              /*      int num1;
                    int num2;
                    int resultado;

                    System.out.println("Ingrese el primer número");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2=sc.nextInt();
                    resultado=num1+num2;
                    System.out.println("El resultado es: "+resultado);*/
       
        //Ingreso de Nombres, edad y sueldo
        //Mostrar los datos ingresados
        
       /* String NombreIngreso;
        int edadIngreso;
        Double SueldoIngreso;
        
        System.out.println("Ingrese su Nombre");
        NombreIngreso=sc.nextLine();
        System.out.println("Ingrese su edad");
        edadIngreso=sc.nextInt();
        System.out.println("Ingrese su sueldo");
        SueldoIngreso=sc.nextDouble();
        
        System.out.println("=================");        
        System.out.println("El nombre Ingresado es: "+ NombreIngreso+ "\n"+
                            "La edad Ingresa es: "+ edadIngreso+"\n"+
                            "El sueldo ingresado es: "+ SueldoIngreso);*/
   
        //Condicionales
        //CONDICIONES IF
        
        if (10>5) {
            System.out.println("10 es mayor a 5");
        }
        
        
        int condicionalNum1=10;
        int condicionalNum2=8;
        
        if (condicionalNum1>condicionalNum2) {           
             System.out.println("10 es mayor a 8");
        }
        
        //Condicionales IF ELSE
        
        int edad=15;
        
        if (edad<18) {
            System.out.println("Usted es menor de edad");
        }
        else{
            System.out.println("Usted es MAYOR de edad");
        }
        
        //Condicionales anidadas
        
        int hora= 11;
        
        if (hora<=11) {
            System.out.println("Es mañana");
        }
        else if(hora==12){
            System.out.println("Es el medio día");
        }       
        else {
            System.out.println("Es noche");
        }
        
        //Condicionales utilizando operadores ternarios
        
        int edad2=5;
        String ResultadoEdad= (edad2<18)?"Menor de Edad": "Mayor de edad";
        System.out.println(ResultadoEdad);
        
        //Switch Case
        int diaSemana = 5;
        
        switch (diaSemana){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("No ingresó un día válido");  
        }
        
        // Ciclos Infinitos While
        
      /*  int contadorWhile =8;
        
        //Se ejecutará siempre y cuando la condición sea Verdadera
        
        while (contadorWhile<10) {            
            System.out.println(contadorWhile);
            //contadorWhile++;
            //contadorWhile= contadorWhile+1;
            contadorWhile--;
        }
        */
        //Do While
        
        //Aquí siempre se ejecuta una vez la instruccion como mínimo
        
        int contadorDoWhile =0;
        
        do {            
            System.out.println(contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile<5);
        
        
        System.out.println("===================");
        
        
        //Ciclos finitos FOR
        int i;
        for (i=0;i<5;i++) {
            System.out.println(i);
        }
        
        //FOR EACH nos sirve para recorrer arreglos, vectores, matrices
        
        String [] AlumnosForEch = {"Frank","Liliana","Claudio","Vinicio"};
        //Mostrar todos los registros
        for(String iForeach:AlumnosForEch){
            System.out.println(iForeach);
        }
        
        //Matrices unidimensionales
        
        String [] matrizAutos = {"Toyota","BMW","Ford"};
        
        int [] matrizNumero = {10,11,12,13,14,15};
        
        //Mostrando valores de la matriz por posicion
        
        System.out.println(matrizAutos[0]);
        
        //Cambiando de valor un elemento de mi matriz
        System.out.println("**********************");
        
        matrizAutos[1]="Subaru";
        System.out.println(matrizAutos[1]);
        System.out.println("**********************");
        for(String iForeach2:matrizAutos){
            System.out.println(iForeach2);
        }
        
        //Matrices multidimensionales
        int [][] matrizMultidimensional ={{1,2,3,4},{5,6,7,8}};
        
        int misElementos = matrizMultidimensional[0][1];
        System.out.println(misElementos);
        
        System.out.println("*****************");
        
        //Mostrando Todas los datos de mi matriz multidimensional
        for (int i2 = 0; i2 < matrizMultidimensional.length; i2++) {
            System.out.print("\n");
            for (int j2 = 0; j2 < matrizMultidimensional[i2].length; j2++) {
                System.out.print(matrizMultidimensional[i2][j2]);   
            }
        }
        
   
}
