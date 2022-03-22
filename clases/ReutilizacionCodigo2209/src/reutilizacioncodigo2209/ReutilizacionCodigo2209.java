/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());

        /* JFrame ventana = new JFrame("Mi primer ventana Java");
ventana.setSize(600,400);
ventana.setVisible(true);

         */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
//Ejercicio: establecer un mouse de marca Logitech tipo óptico

        miCompu.setRaton(new Mouse("Logitech", "Optico"));
        System.out.println(miCompu);

        Computadora compu2 = new Computadora("Apple", "MacBook Pro",
                new Monitor("Toshiba", 14.5f),
                new Mouse("Acteck", "óptico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));

        System.out.println(compu2);
        compu2.setRaton(new Mouse("apple", "Touch"));
        System.out.println(compu2);

        System.out.println("------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);

        Alumno alu2 = new Alumno("1123123", "ICO", "José Pérez", 19);
        System.out.println(alu2);
        alu1.setNumeroCuenta("2323232323");
        alu1.setEdad(19);
        System.out.println(alu1);

        System.out.println("-----------Composicion y herencia en la misma clase-----------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetaRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);

        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);

        server.getRaton().setMarca("Logitech");
        System.out.println(server);








        System.out.println("           EJEMPLO de polimorfismo         ");

        Perro dog = new Perro("Bulldog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();




    }
}
