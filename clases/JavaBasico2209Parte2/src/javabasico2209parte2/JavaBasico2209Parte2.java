/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* EXCEPCIONES
//| < >
         */

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println(" ");
        System.out.println("--------");
        System.out.println(" ");

// A PARTIR DE AQUI CORREGIR TODO LO DE TRY CATCH
        Scanner teclado = new Scanner(System.in);

        int seleccion = 0;
        String elNombre = "";

        try {
            seleccion = teclado.nextInt();
            elNombre = nombres.get(seleccion);
        } catch (InputMismatchException e) {
            System.out.println("Debes teclear los valores numericos");
            elNombre = nombres.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("ERROR, debe ser enre 0 y 4");
            elNombre = nombres.get(0);
        } catch (Exception e) {
            System.out.println("Generica");
            elNombre = nombres.get(1);
        } finally {
            System.out.println(elNombre);
//limpieza
        }

        System.out.println("Continua el programa");

        Aritmetica cal = new Aritmetica(2, 0);
        System.out.println(cal.getA() + "+" + cal.getB() + "=" + cal.sumar());
        try {
            System.out.println(cal.getA() + "/" + cal.getB() + "=" + cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmetica");
        }

        System.out.println("Fin del programa");

//nunca permitir que un programa termine de forma abrupta 
    }

}
