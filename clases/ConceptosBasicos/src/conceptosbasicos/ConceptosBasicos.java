/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author PC
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla sl = new Silla();
        System.out.println(sl); //por defecto se importa toString()
        System.out.println(sl.toString());

        Automovil miBocho = new Automovil();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);

        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        Automovil miAkura = new Automovil("Akura", "NSX", 2013, Color.gray);
        System.out.println(miAkura);

    }
}
