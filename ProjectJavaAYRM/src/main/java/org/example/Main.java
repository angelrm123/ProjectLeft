package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Desarrollar un programa que le pregunte al
        // usuario 3 numeros  y decirle cual es el mayor de los 3.
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 4 numeros");

        double numero1, numero2, numero3, numero4;
        numero1 = scanner.nextDouble();
        numero2 = scanner.nextDouble();
        numero3 = scanner.nextDouble();
        numero4 = scanner.nextDouble();


        if (numero1 > numero2 && numero1 > numero3 && numero1> numero4) {
            System.out.println("El numero1 es mayor ");
        }
        if (numero2 > numero3 && numero2 > numero1 && numero2> numero4) {
            System.out.println("El numero2 es mayor");
        }
        if (numero3 > numero2 && numero3 > numero1 && numero3> numero4) {
            System.out.println("El numero3 es mayor");
        }
        if (numero1 == numero2 && numero1 == numero3 && numero1 == numero4 ) {
            System.out.println("Los numeros son iguales");
        }



for(int i=0; i<10; i++){
    System.out.println("i vale: "+i);*/
//Suma de 2 numeros y que se repita 4 veces
        /*Scanner miscaner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
       int numero1;
       int numero2;
       int suma;

        for(int i=0; i<4; i++){


            System.out.println("Ingresa el primer numero: ");
            numero1 = miscaner.nextInt();

            System.out.print("Ingresa el segundo numero: ");
            numero2 = miscaner.nextInt();


            suma = numero1 + numero2;
            System.out.print("El resultado de la suma es: " + suma);

        }*/

        /*Scanner miscaner = new Scanner(System.in);

        int edad;


        for(int i=0; i<4; i++){
            System.out.println("Ingrese su edad");
            edad = miscaner.nextInt();

            System.out.println();
            if (edad > 17){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");


            }
        }*/

// Desarrollar un programa que lea 10 numeros y los sume todos que los multiplique *2

        /*Scanner miscaner = new Scanner(System.in);

        int suma;
        int multi;
         int numero1;
        System.out.println("Ingresa el primer numero:");
        numero1 = miscaner.nextInt();

        int numero2;
        System.out.println("Ingresa el primer numero:");
        numero2 = miscaner.nextInt();

        int numero3;
        System.out.println("Ingresa el primer numero:");
        numero3 = miscaner.nextInt();

        int numero4;
        System.out.println("Ingresa el primer numero:");
        numero4 = miscaner.nextInt();

        int numero5;
        System.out.println("Ingresa el primer numero:");
        numero5 = miscaner.nextInt();

        int numero6;
        System.out.println("Ingresa el primer numero:");
        numero6 = miscaner.nextInt();

        int numero7;
        System.out.println("Ingresa el primer numero:");
        numero7 = miscaner.nextInt();

        int numero8;
        System.out.println("Ingresa el primer numero:");
        numero8 = miscaner.nextInt();

        int numero9;
        System.out.println("Ingresa el primer numero:");
        numero9 = miscaner.nextInt();

        int numero10;
        System.out.println("Ingresa el primer numero:");
        numero10 = miscaner.nextInt();

        suma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
        multi = suma *2;

        System.out.println("El resultado es: " + multi);*/

       /*  Scanner scaner = new Scanner(System.in);
        int arreglo_num[] = new int[10];
        int suma = 0;
        for(int i=0; i<10; i++) {
            System.out.println("Ingresa el numero " + (i + 1));
            arreglo_num[i] = scaner.nextInt();
            suma = suma + arreglo_num[i];
        }
        suma = suma*2;
        System.out.println("El resultado es: " + suma);*/

        //El usuario va a ingresar un numero, mostrar si el numero es mayor igual a 18 y si no marcar error el programa
        //se va a repitir 5 veces


        Scanner scaner = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa el numero: ");
        numero = scaner.nextInt();

        if(numero >= 18){
            System.out.println("Es mayor de 18");
        }else{
            System.out.println("Error en el programa.");
        }

        for(int i =0; i<5; i++){
            System.out.println("Ingresa el numero: ");
            numero = scaner.nextInt();

            if(numero >= 18){
                System.out.println("Es mayor de 18");
            }else{
                System.out.println("Error en el programa.");
            }
        }

        for(int i =0; i<100; i++){
            System.out.println("Angel" );

        }
    }

}




