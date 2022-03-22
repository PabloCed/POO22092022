/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import Libro.Autor;
import Libro.Editorial;
import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;

/**
 *
 * @author PC
 */
public class TareaComposicion {
    
    public static void main(String[] args) {

        System.out.println("Datos del libro Geometría Analítica:");
        Editorial miEdit = new Editorial();
        miEdit.setTitulo("Limusa");
        miEdit.setNumero(5);
        System.out.println(miEdit);

        Autor miAut = new Autor();
        miAut.setNombre("Charles H. Lehmann");
        miAut.setEdad(50);
        System.out.println(miAut);


        System.out.println("                ");


        System.out.println("Datos de la película El Faro: ");

Productora miProd = new Productora();
miProd.setNombre("A24");
miProd.setPais("Estados Unidos");

Director miDirec = new Director();
miDirec.setName("Robert Eggers");
miDirec.setEdad(38);


Actor miAct = new Actor();
miAct.setNombre("Robert Pattinson");
miAct.setPremios(20);

//realice un pequeño cambio a los atributos de mi director para que tuviera más sentido la información

        System.out.println(miAct);
        System.out.println(miDirec);
        System.out.println(miProd);


    }
    
}
